package com.stark.patterns.structural.composite;

public class Main {
    public static void main(String args[]) {
        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safteyMenuItem =  new MenuItem("Safety", "/safety");
        mainMenu.add(safteyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimMenu = new MenuItem("Personal Claim", "/personalClaims");
        claimsSubMenu.add(personalClaimMenu);

        System.out.println(mainMenu.toString() );
    }
}
