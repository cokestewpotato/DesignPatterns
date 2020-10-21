package com.allcoolboys.singleton;

/**
 * lazy loading
 * 懒汉式
 * 静态内部类
 * JVM保障线程安全
 * 加载外部类时不会加载内部类实现懒加载
 * @author coolboy
 */
public class Singleton07 {

    private Singleton07() {

    }

    private static class SingletonHolder {
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    public static Singleton07 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        Singleton07 s01 = Singleton07.getInstance();
        Singleton07 s02 = Singleton07.getInstance();
        System.out.println(s01 == s02);
    }
}
