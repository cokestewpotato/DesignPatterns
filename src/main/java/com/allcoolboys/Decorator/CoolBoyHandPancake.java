package com.allcoolboys.Decorator;

/**
 * 手抓饼门店
 * @author coolboy
 */
public class CoolBoyHandPancake implements HandPancake {
    @Override
    public String offerHandPancake() {
        return "手抓饼";
    }

    @Override
    public Integer calcCost() {
        return 3;
    }
}
