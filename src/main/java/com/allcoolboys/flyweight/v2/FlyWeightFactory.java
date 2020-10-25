package com.allcoolboys.flyweight.v2;

import java.util.HashMap;

/**
 * 享元工厂
 * @author coolboy
 */
public class FlyWeightFactory {
    /**
     * 饿汉式单例
     */
    private static final FlyWeightFactory INSTANCE = new FlyWeightFactory();

    /**
     * 使用HashMap管理享元池
     */
    private HashMap<String, Character> hashMap = new HashMap<>();
    /**
     * 管理复合享元对象(里面引用了一享元对象所以叫复合享元)
     */
    private HashMap<String, ColorCharacter> compositeMap = new HashMap<>();

    private FlyWeightFactory() {}

    /**
     * 根据innerState获取池中的对象
     * 存在返回，不存在创建并返回
     * @param innerState
     * @return
     */
    public Character getCharacter(String innerState) {
        Character character;
        if (hashMap.containsKey(innerState)) {
            character = hashMap.get(innerState);
        } else {
            character = new ChineseCharacter(innerState);
            hashMap.put(innerState, character);
        }

        return character;
    }

    /**
     * 根据innerState获取池中的对象
     * 存在返回，不存在创建并返回
     * @param innerState
     * @return
     */
    public ColorCharacter getColorCharacter(String innerState) {
        ColorCharacter colorCharacter;
        if (compositeMap.containsKey(innerState)) {
            colorCharacter = compositeMap.get(innerState);
        } else {
            colorCharacter = new ColorCharacter(innerState);
            compositeMap.put(innerState, colorCharacter);
        }

        return colorCharacter;
    }

    /**
     * 单例全局访问接口获取工厂
     */
    public static FlyWeightFactory getInstance() {
        return INSTANCE;
    }
}
