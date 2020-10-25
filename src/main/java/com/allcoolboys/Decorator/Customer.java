package com.allcoolboys.Decorator;

/**
 * 顾客
 *
 * @author coolboy
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void buy(HandPancake handPancake) {
        System.out.println("顾客" + name + "购买了" + handPancake.offerHandPancake()
                + "一份，花了" + handPancake.calcCost() + "元");
    }
}
