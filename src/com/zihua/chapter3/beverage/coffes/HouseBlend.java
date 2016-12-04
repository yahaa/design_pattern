package com.zihua.chapter3.beverage.coffes;

import com.zihua.chapter3.beverage.Beverage;

/**
 * Created by zihua on 16-12-4.
 */
public class HouseBlend extends Beverage {
    private int co=100;
    @Override
    public String getDiscription() {
        return "HouseBlend";
    }

    @Override
    public int cost() {
        return co;
    }
}
