package com.stark.patterns.behavioral.memento;

public class Main {
    public static void main(String args[]) {
        CareTaker careTaker = new CareTaker();
        Employee employee = new Employee();

        employee.setName("John Wick");
        employee.setAddress("111 Main Street");
        employee.setPhone("888-555-1212");
        careTaker.save(employee);
        System.out.println("Initial state: " + employee);

        employee.setPhone("444-555-6666");
        careTaker.save(employee);
        System.out.println("After phone number change: " + employee);

        employee.setPhone("333-999-6666");
        careTaker.revert(employee);
        System.out.println("Revert to last phone number: " + employee);

        careTaker.revert(employee);
        System.out.println("Revert to original: " + employee);

    }
}
