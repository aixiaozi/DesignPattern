package com.accenture.showcase.observer.forUML;

public class ConcreteObserver implements Observer {

    private String name;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    private String observerState;

    public String getState() {
        return observerState;
    }

    public void setState(String state) {
        this.observerState = state;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者：" + name + "  您订阅的主题状态有更新： " + observerState);
    }

}

