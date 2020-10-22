package com.allcoolboys.strategy;

/**
 * 根据小狗的体重比较
 * @author coolboy
 */
public class DogWeightComparator implements Comparator<Dog>{
    @Override
    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.weight, o2.weight);
    }
}
