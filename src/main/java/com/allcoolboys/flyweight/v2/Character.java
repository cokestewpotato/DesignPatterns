package com.allcoolboys.flyweight.v2;

/**
 * 享元抽象：字符
 * 单纯享元模式:FlyWeight子类都可以被共享，那就是所有的享元对象都可以被共享
 * @author coolboy
 */
public abstract class Character {
    /**
     * 抽象的业务逻辑方法,接受外部状态作为参数
     * @param outerState
     */
    abstract void display(String outerState);
}
