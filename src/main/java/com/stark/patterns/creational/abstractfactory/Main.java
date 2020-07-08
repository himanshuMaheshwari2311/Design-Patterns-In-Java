package com.stark.patterns.creational.abstractfactory;

public class Main {
    public static void main(String args[]) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard creditCard = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(creditCard.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard creditCard1 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(creditCard1.getClass());
    }
}
