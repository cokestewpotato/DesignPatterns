package com.allcoolboys.factory.simplefactory;

/**
 * 简单工程
 *
 * @author coolboy
 */
public class SimpleFactory {
    public Car createCar() {
        return new Car();
    }

    public Plane createPlane() {
        return new Plane();
    }

    public Bike createBike() {
        return new Bike();
    }
}
