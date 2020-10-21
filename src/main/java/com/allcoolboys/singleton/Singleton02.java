package com.allcoolboys.singleton;

/**
 * 跟01一样
 * @author coolboy
 */
public class Singleton02 {

    private static final Singleton02 INSTANCE;
    static {
        INSTANCE = new Singleton02();
    }

    private Singleton02 (){}

    private static Singleton02 getInstance() {

        return INSTANCE;
    }
}
