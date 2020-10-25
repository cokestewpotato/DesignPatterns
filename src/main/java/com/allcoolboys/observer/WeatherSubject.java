package com.allcoolboys.observer;

/**
 * 具体的被观察者：天气
 * @author coolboy
 */
public class WeatherSubject extends Subject {
    public void change() {
        super.notifyObservers("下雨了");
    }

    @Override
    public String toString() {
        return "被观察者：天气";
    }
}
