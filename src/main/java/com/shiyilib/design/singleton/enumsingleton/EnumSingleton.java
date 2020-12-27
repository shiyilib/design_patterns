package com.shiyilib.design.singleton.enumsingleton;

public enum EnumSingleton {
    INSTANCE;

    public void print(){
        System.out.println(this.hashCode());
    }
}

class EnumTest{

    public static void main(String[] args) throws Exception {
        /*EnumSingleton i1 = EnumSingleton.INSTANCE;
        EnumSingleton i2 = EnumSingleton.INSTANCE;
        System.out.println(i1 == i2);*/
        /*Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        EnumSingleton i1 = declaredConstructor.newInstance("INSTANCE",0);*/
        /*Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
        at java.lang.reflect.Constructor.newInstance(Constructor.java:417)
        at com.shiyilib.design.singleton.enumsingleton.EnumTest.main(EnumSingleton.java:22)*/


    }
}
