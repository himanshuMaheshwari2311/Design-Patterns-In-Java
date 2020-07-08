package com.stark.patterns.creational.abstractfactory;

public class AmexGoldValidator implements Validator {

    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
