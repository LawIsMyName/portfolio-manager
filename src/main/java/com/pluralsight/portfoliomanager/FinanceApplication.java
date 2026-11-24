package com.pluralsight.portfoliomanager;

import com.pluralsight.portfoliomanager.model.*;

import java.math.BigDecimal;

public class FinanceApplication {

    public static void main(String[] args) {
        House house = new House("Ranch house", new BigDecimal("325000.00"), 1998, 1850, 3);
        Gold gold = new Gold("Gold coins", new BigDecimal("12000.00"), 5.0);
        Jewelry ring = new Jewelry("Grandma's ring", new BigDecimal("2500.00"), 14.0);

        System.out.println(house.getName() + ": $" + house.getValue());
        System.out.println(gold.getName() + ": $" + gold.getValue());
        System.out.println(ring.getName() + ": $" + ring.getValue());

        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
        account1.deposit(new BigDecimal("100"));

        Valuable account2 = new BankAccount(456, "Gary", new BigDecimal("1500"));
        //account2.deposit(new BigDecimal("100"));

        System.out.println("Account 1: $" + account1.getValue());
        System.out.println("Account 2: $" + account2.getValue());

        CreditCard creditCard = new CreditCard(789, "Gary", new BigDecimal("2500.00"));

        Portfolio portfolio = new Portfolio("Personal Portfolio", "Gary");

        portfolio.add(house);
        portfolio.add(gold);
        portfolio.add(ring);
        portfolio.add(account1);
        portfolio.add(creditCard);

        System.out.println("\n---- PORTFOLIO SUMMARY ----");
        System.out.println("Portfolio: " + portfolio.getName());
        System.out.println("Owner: " + portfolio.getOwner());
        System.out.printf("Total Value: $%.2f%n", portfolio.getValue());
        System.out.printf("Most Valuable: $%.2f%n", portfolio.getMostValuable().getValue());
        System.out.printf("Least Valuable: $%.2f%n", portfolio.getLeastValuable().getValue());
    }
}
