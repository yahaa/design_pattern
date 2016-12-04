package com.zihua.chapter3.beverage.condiments;

import com.zihua.chapter3.beverage.Beverage;
import com.zihua.chapter3.beverage.Condiment;


/**
 * Created by zihua on 16-12-4.
 */
public class Milk extends Condiment {
    private Beverage beverage;
    private int co=100;


    public Milk(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDiscription() {
        return "milk "+ beverage.getDiscription();
    }

    @Override
    public int cost() {
        return co+beverage.cost();
    }
}
