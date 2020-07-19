package com.stark.patterns.behavioral.memento;

import java.util.Stack;

// Caretaker
public class CareTaker {
    private Stack<EmployeeMemento> employeeMementos = new Stack<>();

    public void save(Employee emp) {
        employeeMementos.push(emp.save());
    }

    public void revert(Employee emp) {
        emp.revert(employeeMementos.pop());
    }
}
