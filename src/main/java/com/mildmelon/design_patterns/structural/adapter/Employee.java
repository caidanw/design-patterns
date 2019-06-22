package com.mildmelon.design_patterns.structural.adapter;

public interface Employee {

    String getId();
    String getFirstName();
    String getLastName();
    String getEmail();

    default String info() {
        return String.format(
                "ID: %s, Name: %s %s, Email: %s",
                this.getId(),
                this.getFirstName(), this.getLastName(),
                this.getEmail()
        );
    }

}
