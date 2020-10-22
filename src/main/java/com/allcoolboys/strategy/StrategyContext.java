package com.allcoolboys.strategy;

import java.util.Arrays;

/**
 * 行为内容
 * @author coolboy
 */
public class StrategyContext {
    public static void main(String[] args) {
        Dog[] array = {new Dog(5, 2), new Dog(4, 8), new Dog(9, 3)};

        Sort<Dog> sort = new Sort<>();
        //具体的算法也可以通过配置文件做修改
        sort.sort(array, new DogHeightComparator());
        System.out.println(Arrays.toString(array));

        sort.sort(array, new DogWeightComparator());
        System.out.println(Arrays.toString(array));
    }
}
