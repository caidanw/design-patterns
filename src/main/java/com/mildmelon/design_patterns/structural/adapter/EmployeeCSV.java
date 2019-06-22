package com.mildmelon.design_patterns.structural.adapter;

import lombok.Getter;

import java.util.StringTokenizer;

@Getter
public class EmployeeCSV {

    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");

        if (tokenizer.hasMoreElements()) {
            this.id = Integer.parseInt(tokenizer.nextToken());
        }

        if (tokenizer.hasMoreElements()) {
            this.firstName = tokenizer.nextToken();
        }

        if (tokenizer.hasMoreElements()) {
            this.lastName = tokenizer.nextToken();
        }

        if (tokenizer.hasMoreElements()) {
            this.emailAddress = tokenizer.nextToken();
        }
    }

}
