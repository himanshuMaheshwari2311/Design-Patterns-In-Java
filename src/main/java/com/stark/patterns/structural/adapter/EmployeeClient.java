package com.stark.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeesList() {
        List<Employee> employees = new ArrayList<Employee>();
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        employees.add(employeeFromDB);

        EmployeeLdap employeeLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
        employees.add(new EmployeAdapterLdap(employeeLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("567, Sherlock, Holmes, sherlock@holmes.com");
        employees.add(new EmployeeAdapterCSV(employeeCSV));
        return employees;
    }
}
