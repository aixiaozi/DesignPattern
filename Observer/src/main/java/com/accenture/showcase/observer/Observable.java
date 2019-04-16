package com.accenture.showcase.observer;

/**
 * Observable.java
 * 	抽象被观察者
 */
interface Observable {
    //发送广播
    void notifyObserver(String message);
}
