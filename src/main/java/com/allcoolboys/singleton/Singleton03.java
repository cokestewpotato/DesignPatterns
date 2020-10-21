package com.allcoolboys.singleton;

/**
 * 懒加载
 * 虽然达到了按需初始化目的，但线程不安全
 * @author coolboy
 */
public class Singleton03 {

    private static Singleton03 INSTANCE;

    private Singleton03 (){}

    private static Singleton03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton03();
        }

        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                System.out.println(Singleton03.getInstance().hashCode());
            }).start();
        }
    }
}
