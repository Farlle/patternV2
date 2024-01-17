package com.company.task1;

import com.company.task1.factory.CreditCardFactory;
import com.company.task1.factory.DebitCardFactory;

public class Main {
    public static void main(String[] args) {
        var creditCardFactory = new CreditCardFactory();
        var debitCardFactory = new DebitCardFactory();

        var creditCard1 = creditCardFactory.createCard(123456789);
        var debitCard1 = debitCardFactory.createCard(987654321);

        System.out.println(creditCard1.setBalance(50_000));
        System.out.println(creditCard1.decreaseBalance(5_000));
        System.out.println(creditCard1.decreaseBalance(50_000));
        System.out.println(creditCard1.increaseBalance(51_000));
        System.out.println(creditCard1.getBalance());
        System.out.println(debitCard1.setBalance(50_000));
        System.out.println(debitCard1.decreaseBalance(5_000));
        System.out.println(debitCard1.decreaseBalance(50_000));
        System.out.println(debitCard1.increaseBalance(51_000));
        System.out.println(debitCard1.getBalance());
    }
}
