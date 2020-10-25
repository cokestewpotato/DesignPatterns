package com.allcoolboys.factory.abstractfactory;

/**
 * 抽象工厂
 * 创建产品族时使用，方便创建一族多个产品
 * @author coolboy
 */
public abstract class AbstractFactory {
    /**
     * 创建交通工具
     * @return
     */
    abstract Vehicle createVehicle();

    /**
     * 创建食物
     * @return
     */
    abstract Food createFood();
}
