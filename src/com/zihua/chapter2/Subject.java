package com.zihua.chapter2;

/**
 * Created by zihua on 16-12-4.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
