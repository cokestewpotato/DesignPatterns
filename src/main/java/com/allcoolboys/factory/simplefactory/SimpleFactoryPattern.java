package com.allcoolboys.factory.simplefactory;

/**
 * 简单工厂使用
 *
 * @author coolboy
 */
public class SimpleFactoryPattern {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();

        Car car = factory.createCar();
        Plane plane = factory.createPlane();
        Bike bike = factory.createBike();
    }
}
