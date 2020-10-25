package com.allcoolboys.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * 被观察者
 * @author coolboy
 */
public class Subject {
    private List<Observer> observerList;

    public Subject() {
        observerList = new LinkedList<>();
    }

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(Object arg) {
        for(Observer o : observerList) {
            o.update(this, arg);
        }
    }
}
