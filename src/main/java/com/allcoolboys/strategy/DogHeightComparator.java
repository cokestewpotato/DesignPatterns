package com.allcoolboys.strategy;

/**
 * 根据小狗的高度比较
 * @author coolboy
 */
public class DogHeightComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.height, o2.height);
    }
}
