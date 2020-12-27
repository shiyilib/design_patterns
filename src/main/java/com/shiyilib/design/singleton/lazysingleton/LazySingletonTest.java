package com.shiyilib.design.singleton.lazysingleton;

public class LazySingletonTest {

    public static void main(String[] args){
        /*LazySingleton instance = LazySingleton.getInstance();
        LazySingleton instance1 = LazySingleton.getInstance();
        System.out.println(instance == instance1);*/

        /*new Thread(()->{
            LazySingleton i2 = LazySingleton.getInstance();
            System.out.println(i2);
        }).start();
        new Thread(()-> {
            LazySingleton i3 = LazySingleton.getInstance();
            System.out.println(i3);
        }).start();*/

    }


}

class LazySingleton{

    private static LazySingleton instance;
    //私有化构造函数
    private LazySingleton(){}

    //双重检查
    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized (LazySingleton.class){
                if(instance == null)
                instance = new LazySingleton();
                //字节码层 指令重排
                //JIT 即时编译器 CPU
                //1. 分配空间
                //2. 初始化
                //3. 引用赋值
            }

        }
        return instance;
    }

}