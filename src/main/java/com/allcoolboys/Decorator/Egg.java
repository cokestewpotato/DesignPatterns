package com.allcoolboys.Decorator;

/**
 * 具体的装饰类：鸡蛋
 * @author coolboy
 */
public class Egg extends Decorator {
    protected Egg(HandPancake handPancake) {
        super(handPancake);
    }

    @Override
    public String offerHandPancake() {
        return super.offerHandPancake() + "添加鸡蛋";
    }

    @Override
    public Integer calcCost() {
        return super.calcCost() + 2;
    }
}
