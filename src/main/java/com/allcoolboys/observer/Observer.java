package com.allcoolboys.observer;

/**
 * 观察者接口
 * @author coolboy
 */
public interface Observer {
    /**
     * 更新
     * @param source 被观察者
     * @param arg 参数
     */
    void update(Subject source, Object arg);
}
