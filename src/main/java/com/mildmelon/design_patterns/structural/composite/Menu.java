package com.mildmelon.design_patterns.structural.composite;

public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add(MenuComponent component) {
        menuComponents.add(component);
        return component;
    }

    @Override
    public MenuComponent remove(MenuComponent component) {
        menuComponents.remove(component);
        return component;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));

        for (MenuComponent component : menuComponents) {
            builder.append(component.toString());
        }

        return builder.toString();
    }
}
