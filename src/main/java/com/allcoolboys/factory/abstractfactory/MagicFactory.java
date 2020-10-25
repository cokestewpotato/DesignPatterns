package com.allcoolboys.factory.abstractfactory;

/**
 * 魔法工厂
 * @author coolboy
 */
public class MagicFactory extends AbstractFactory {
    @Override
    Vehicle createVehicle() {
        return new MagicBroom();
    }

    @Override
    Food createFood() {
        return new Mushroom();
    }
}
