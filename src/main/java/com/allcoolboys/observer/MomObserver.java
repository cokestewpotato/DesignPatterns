package com.allcoolboys.observer;

/**
 * 观察者老妈
 * @author coolboy
 */
public class MomObserver implements Observer {
    @Override
    public void update(Subject source, Object arg) {
        System.out.println("观察者老妈，" + source + "， 参数：" + arg + ", 我该收衣服了");
    }
}
