package com.zihua.chapter3.beverage.coffes;

import com.zihua.chapter3.beverage.Beverage;

/**
 * Created by zihua on 16-12-4.
 */
public  class DarkBoas extends Beverage {
    private int co=14;
    @Override
    public String getDiscription() {
        return "DarkBoast";
    }

    @Override
    public int cost() {
        return co;
    }
}

