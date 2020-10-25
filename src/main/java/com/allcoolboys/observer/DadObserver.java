package com.allcoolboys.observer;

/**
 * 观察者老爸
 * @author coolboy
 */
public class DadObserver implements Observer {
    @Override
    public void update(Subject source, Object arg) {
        System.out.println("观察者老爸，" + source + "，参数：" + arg + "，我该关窗户了");
    }
}
