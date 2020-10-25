package com.allcoolboys.Decorator;

/**
 * 装饰器类
 * @author coolboy
 */
public abstract class Decorator implements HandPancake {
    private HandPancake handPancake;

    protected Decorator(HandPancake handPancake) {
        this.handPancake = handPancake;
    }

    @Override
    public String offerHandPancake() {
        return this.handPancake.offerHandPancake();
    }

    @Override
    public Integer calcCost() {
        return this.handPancake.calcCost();
    }
}
