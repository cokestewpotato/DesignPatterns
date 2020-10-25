package com.allcoolboys.Decorator;

/**
 * 具体的装饰类：培根
 * @author coolboy
 */
public class Bacon extends Decorator {

    protected Bacon(HandPancake handPancake) {
        super(handPancake);
    }

    @Override
    public String offerHandPancake() {
        return super.offerHandPancake() + "添加培根";
    }

    @Override
    public Integer calcCost() {
        return super.calcCost() + 2;
    }
}
