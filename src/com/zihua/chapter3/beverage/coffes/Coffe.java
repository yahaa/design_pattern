package com.zihua.chapter3.beverage.coffes;

import com.zihua.chapter3.beverage.Beverage;

/**
 * Created by zihua on 16-12-4.
 */
public class Coffe extends Beverage {
    private int co=10;

    @Override
    public String getDiscription(){
        return "Coffe";
    }

    @Override
    public int cost() {
        return co;
    }

}
