package com.allcoolboys.observer;

/**
 * 观察者模式使用
 * @author coolboy
 */
public class ObserverPattern {
    public static void main(String[] args) {
        WeatherSubject subject = new WeatherSubject();
        subject.add(new DadObserver());
        subject.add(new MomObserver());
        subject.add(new ChildObserver());

        subject.change();
    }
}
