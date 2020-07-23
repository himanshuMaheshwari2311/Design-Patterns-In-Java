package com.stark.patterns.behavioral.strategy;

public class VisaStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid;

        isValid = creditCard.getNumber().startsWith("4");

        if(isValid) {
            isValid = creditCard.getNumber().length() == 16;
        }
        if(isValid) {
            this.passesLuhn(creditCard.getNumber());
        }
        return isValid;
    }
}
