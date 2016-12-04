package com.zihua.chapter3.beverage;

/**
 * Created by zihua on 16-12-4.
 */
public abstract class Beverage {
    String description="Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract String getDiscription();

    public abstract int cost();
}
