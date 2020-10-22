package com.allcoolboys.strategy;

/**
 * 定义一个小狗对象
 * @author coolboy
 */
public class Dog {
    Integer height, weight;

    public Dog(Integer height, Integer weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
