package com.allcoolboys.flyweight.v2;

/**
 * 具体的单享元类：汉字
 * @author coolboy
 */
public class ChineseCharacter extends Character {
    /**
     * 内部状态
     */
    private String innerState;

    public ChineseCharacter(String innerState) {
        this.innerState = innerState;
    }

    /**
     * 外部状态作为参数传递
     */
    @Override
    void display(String outerState) {
        System.out.println("innerState: " + this.innerState + " ,outerState: " + outerState);
    }
}
