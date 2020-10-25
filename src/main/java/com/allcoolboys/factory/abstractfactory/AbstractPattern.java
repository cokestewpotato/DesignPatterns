package com.allcoolboys.factory.abstractfactory;

/**
 * 抽象工厂模式
 * @author coolboy
 */
public class AbstractPattern {
    public static void main(String[] args) {
        // 可以通过配置文件定义工厂类
        AbstractFactory factory = new ModernFactory();

        Vehicle vehicle = factory.createVehicle();
        Food food = factory.createFood();
    }
}
