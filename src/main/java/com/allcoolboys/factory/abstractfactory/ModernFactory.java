package com.allcoolboys.factory.abstractfactory;

/**
 * 现代工厂
 * @author coolboy
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Food createFood() {
        return new Bread();
    }
}
