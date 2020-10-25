package com.allcoolboys.singleton;

/**
 * lazy loading
 * 懒加载
 * 使用synchronized + 双重检查机制，保障只初始化一个实例，
 *
 * @author coolboy
 */
public class Singleton06 {
    private static volatile Singleton06 INSTANCE;

    private Singleton06() {
    }

    private static Singleton06 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton06.class) {
                //双重检查
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton06();
                }
            }
        }

        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                System.out.println(Singleton06.getInstance().hashCode());
            }).start();
        }
    }
}
