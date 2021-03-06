package com.allcoolboys.flyweight.v1;

/**
 * 单纯享元模式测试
 * @author coolboy
 */
public class FlyWeightClient {
    public static void main(String[] args) {
        FlyWeightFactory factory = FlyWeightFactory.getInstance();
        Character flyWeight1 = factory.getCharacter("你");
        Character flyWeight2 = factory.getCharacter("我");
        Character flyWeight3 = factory.getCharacter("你");

        System.out.println(flyWeight1 == flyWeight2);
        // 由于使用了享元池对相同的“内部状态”做了存储所以返回true
        System.out.println(flyWeight1 == flyWeight3);

        // 设置外部元素
        flyWeight1.display("黑色");
        flyWeight2.display("红色");
        flyWeight3.display("绿色");

    }
}
