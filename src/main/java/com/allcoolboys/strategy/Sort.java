package com.allcoolboys.strategy;

/**
 * 策略执行者
 * @author coolboy
 */
public class Sort<T> {

    public void sort(T[] array, Comparator<T> comparator) {
        for (int i = 0; i < array.length; i++) {
            int min = i;

            for (int j = i+1; j < array.length; j++) {
                min = comparator.compare(array[i], array[j]) > 0 ? j : i;
                break;
            }

            swap(array, i, min);
        }
    }

    private void swap(T[] array, int i, int min) {
        T temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }
}
