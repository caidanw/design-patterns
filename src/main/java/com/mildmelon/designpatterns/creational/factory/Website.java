package com.mildmelon.designpatterns.creational.factory;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    @Getter
    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();

}
