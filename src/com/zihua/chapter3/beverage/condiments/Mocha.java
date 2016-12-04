package com.zihua.chapter3.beverage.condiments;

import com.zihua.chapter3.beverage.Beverage;
import com.zihua.chapter3.beverage.Condiment;

/**
 * Created by zihua on 16-12-4.
 */
public class Mocha extends Condiment {
    private Beverage beverage;
    private int co=15;

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDiscription() {
        return "Mocha "+beverage.getDiscription();
    }

    @Override
    public int cost() {
        return co+beverage.cost();
    }
}
