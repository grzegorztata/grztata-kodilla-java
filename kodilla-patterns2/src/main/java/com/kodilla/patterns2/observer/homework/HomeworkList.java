package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkList implements Observable {
    private final List<Observer> observers;
    private final List<String> messages;
    private final String name;

    public HomeworkList(String name) {
        observers = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        messages.add(task);
        notifyObservers();
    }

    public List<String> getMessages() {
        return messages;
    }
    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}
