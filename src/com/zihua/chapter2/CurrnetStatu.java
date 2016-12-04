package com.zihua.chapter2;

/**
 * Created by zihua on 16-12-4.
 */
public class CurrnetStatu implements Observer,Display {
    private Float temperature;
    private Float huimidity;
    private Float pressure;
    private int id;
    private Subject subject;

    public CurrnetStatu(int id,Subject subject){
        this.subject=subject;
        this.id=id;
        subject.registerObserver(this);
    }

    @Override
    public void update(Float temperature, Float huimidity, Float pressure) {
        this.temperature=temperature;
        this.huimidity=huimidity;
        this.pressure=pressure;
        display();
    }

    @Override
    public void display() {
        StringBuffer sb=new StringBuffer();
        sb.append(id+" Current conditions: \n"+temperature+"\n"+huimidity+"\n"+pressure+"\n");
        System.out.println(sb);
    }
}
