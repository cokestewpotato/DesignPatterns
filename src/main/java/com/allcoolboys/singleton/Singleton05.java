package com.allcoolboys.singleton;

/**
 * lazy loading
 * 懒汉式
 * 虽然按需达到了初始化的目的，但线程不安全
 * @author coolboy
 */
public class Singleton05 {
    private static Singleton05 INSTANCE;
    private Singleton05 () {}

    private static Singleton05 getInstance() {
        if (INSTANCE == null) {
            synchronized(Singleton05.class) {
                INSTANCE = new Singleton05();
            }
        }

        return INSTANCE;
    }
}
