package com.stark.patterns.structural.adapter;

public class EmployeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    public String getId() {
        return instance.getCn();
    }

    public String getFirstName() {
        return instance.getGivenName();
    }

    public String getLastName() {
        return instance.getSurname();
    }

    public String getEmail() {
        return instance.getMail();
    }
}
