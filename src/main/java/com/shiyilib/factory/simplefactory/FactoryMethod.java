package com.shiyilib.factory.simplefactory;

import java.util.Objects;

public class FactoryMethod {

    public static void main(String[] args) {
        Product a;
        AbstractFactory af;
        af = (AbstractFactory)ReadXml.getObject();
        a = Objects.requireNonNull(af).newProduct();
        a.show();
    }
}

// 提供创建产品的接口 调用者通过它访问具体工厂的工厂方法 来创建产品，
interface Product{
    void show();
}

//具体产品A 实现抽象产品中的方法
class ConCreateProductA implements Product {

    @Override
    public void show() {
        System.out.println("具体产品A展示...");
    }
}
//具体产品B 实现抽象产品中的方法B
class ConCreateProductB implements Product {

    @Override
    public void show() {
        System.out.println("具体产品B展示...");
    }
}

//抽象工厂 提供了产品的生成方法
interface AbstractFactory{

    Product newProduct();
}

class ConcreteFactoryA implements AbstractFactory{

    @Override
    public Product newProduct() {
        System.out.println("具体工厂A生成--> 具体产品A");
        return new ConCreateProductA();
    }
}

class ConcreteFactoryB implements AbstractFactory{

    @Override
    public Product newProduct() {
        System.out.println("具体工厂B生成--> 具体产品B");
        return new ConCreateProductB();
    }
}

