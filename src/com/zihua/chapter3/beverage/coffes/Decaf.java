package com.zihua.chapter3.beverage.coffes;

import com.zihua.chapter3.beverage.Beverage;

/**
 * Created by zihua on 16-12-4.
 */
public class Decaf extends Beverage {
    private int co=59;
    @Override
    public String getDiscription() {
        return "Decaf";
    }

    @Override
    public int cost() {
        return co;
    }
}
