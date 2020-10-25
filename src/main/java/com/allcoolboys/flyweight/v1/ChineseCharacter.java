package com.allcoolboys.flyweight.v1;

/**
 * 享元的具体类：汉字
 * @author coolboy
 */
public class ChineseCharacter extends Character{
    /**
     * 内部状态
     */
    private String innerState;

    public ChineseCharacter(String innerState) {
        this.innerState = innerState;
    }

    /**
     * 外部状态作为参数传递
     * @param outerState
     */
    @Override
    void display(String outerState) {
        System.out.println("字符: " + this.innerState + " ,颜色: " + outerState);
    }
}
