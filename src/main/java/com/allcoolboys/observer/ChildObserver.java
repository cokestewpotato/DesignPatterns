package com.allcoolboys.observer;

/**
 * 观察者：小朋友
 * @author coolboy
 */
public class ChildObserver implements Observer {
    @Override
    public void update(Subject source, Object arg) {
        System.out.println("观察者小孩，" + source + "，参数：" + arg + "，我该回家了");
    }
}
