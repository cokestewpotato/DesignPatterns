package com.allcoolboys.strategy;

/**
 * 策略接口定义
 * @author coolboy
 */
public interface Comparator<T> {
    /**
     * 定义比较方法
     * @param o1
     * @param o2
     * @return
     */
    int compare(T o1, T o2);
}
