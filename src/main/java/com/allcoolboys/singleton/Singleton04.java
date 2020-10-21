package com.allcoolboys.singleton;

/**
 * lazy loading
 * 懒汉式
 * 按需达到了初始化目的，通过synchronized解决了线程安全问题，但同时也带来了效率下降
 * @author coolboy
 */
public class Singleton04 {
    private static Singleton04 INSTANCE;

    private Singleton04() {
    }

    public static synchronized Singleton04 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton04();
        }

        return INSTANCE;
    }
}
