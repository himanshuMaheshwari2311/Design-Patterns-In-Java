package com.stark.patterns.structural.adapter;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeesList();

        System.out.println(employees);
    }
}
