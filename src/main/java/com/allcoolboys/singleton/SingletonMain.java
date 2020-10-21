package com.allcoolboys.singleton;

/**
 * @author coolboy
 */
public class SingletonMain {
    public static void main(String[] args) {
        Singleton01 s01 = Singleton01.getInstance();
        Singleton01 s02 = Singleton01.getInstance();
        System.out.println(s01 == s02);
    }
}
