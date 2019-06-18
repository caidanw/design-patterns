package com.mildmelon.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item implements Cloneable {

    private String title;
    private double price;
    private String url;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
