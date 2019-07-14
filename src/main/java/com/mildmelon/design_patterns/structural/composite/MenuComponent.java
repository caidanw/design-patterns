package com.mildmelon.design_patterns.structural.composite;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    @Getter protected String name;
    @Getter protected String url;
    protected List<MenuComponent> menuComponents = new ArrayList<>();

    public MenuComponent add(MenuComponent component) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent component) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public abstract String toString();

    public String print(MenuComponent component) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }

}
