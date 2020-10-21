package com.allcoolboys.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个对象，JVM保障线程安全
 * 简单实用，推荐使用
 *
 * @author coolboy
 */
public class Singleton01 {

    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {}

    public static Singleton01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton01 s01 = Singleton01.getInstance();
        Singleton01 s02 = Singleton01.getInstance();
        System.out.println(s01 == s02);
    }
}
