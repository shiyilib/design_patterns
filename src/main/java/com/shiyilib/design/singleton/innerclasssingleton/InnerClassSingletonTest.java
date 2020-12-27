package com.shiyilib.design.singleton.innerclasssingleton;

import java.lang.reflect.Constructor;

public class InnerClassSingletonTest {

    public static void main(String[] args) {
        try {
            Constructor<InnerClassSingleton> constructor = InnerClassSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            InnerClassSingleton i1 = constructor.newInstance();
            InnerClassSingleton i2 = InnerClassSingleton.getInstance();
            System.out.println(i1 == i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class InnerClassSingleton{

    private static class InnerClassHolder{
        private static InnerClassSingleton instance =  new InnerClassSingleton();
    }

    private InnerClassSingleton(){
        if(InnerClassHolder.instance!=null){
            throw new RuntimeException("单例模式不允许多个实例");
        }
    }

    public static InnerClassSingleton getInstance(){
        return InnerClassHolder.instance;
    }
}