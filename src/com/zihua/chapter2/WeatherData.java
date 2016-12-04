package com.zihua.chapter2;

import java.util.Vector;

/**
 * Created by zihua on 16-12-4.
 */
public class WeatherData implements Subject {
    private Vector<Observer>observers;
    private Float temperature;
    private Float humidity;
    private Float pressure;

    public WeatherData(){
        observers=new Vector<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

        for(Observer observer:observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    private void change(){
        notifyObserver();
    }

    public void setMeasurements(Float temperature,Float humidity,Float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        change();
    }
}
