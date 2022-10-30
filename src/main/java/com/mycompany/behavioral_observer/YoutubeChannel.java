/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.behavioral_observer;

import java.util.*;

/**
 *
 * @author ayman
 */
public class YoutubeChannel {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer o : observers) {
            o.update();
        }
    }

}
