package com.mildmelon.design_patterns.structural.adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return this.instance.getCn();
    }

    @Override
    public String getFirstName() {
        return this.instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return this.instance.getSurname();
    }

    @Override
    public String getEmail() {
        return this.instance.getMail();
    }

}
