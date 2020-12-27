package com.shiyilib.design.singleton.hungrysingleton;

public class HungrySingletonTest {

    public static void main(String[] args) {
        /*HungrySingleton i1 = HungrySingleton.getInstance();
        HungrySingleton i2 = HungrySingleton.getInstance();
        System.out.println(i1==i2);*/
       /* new Thread(() -> System.out.println(HungrySingleton.getInstance())).start();
        new Thread(() -> System.out.println(HungrySingleton.getInstance())).start();*/
    }
}

//饿汉模式
class HungrySingleton{
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }

}