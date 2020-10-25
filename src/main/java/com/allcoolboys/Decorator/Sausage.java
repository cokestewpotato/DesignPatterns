package com.allcoolboys.Decorator;

/**
 * 具体的装饰类：烤肠
 * @author coolboy
 */
public class Sausage extends Decorator {
    protected Sausage(HandPancake handPancake) {
        super(handPancake);
    }

    @Override
    public String offerHandPancake() {
        return super.offerHandPancake() + "添加烤肠";
    }

    @Override
    public Integer calcCost() {
        return super.calcCost() + 1;
    }
}
