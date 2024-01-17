package com.company.task1.card;

public class CreditCard implements Card {
    private int balance;
    private int number;

    CreditCard(int number){
        this.number=number;
    }

    @Override
    public String increaseBalance(int sum) {
        balance += sum;
        return "Новый баланс = " + balance;
    }

    @Override
    public String decreaseBalance(int sum) {
        if (balance < sum) {
            return "Взят кредит. Новый баланс = " + balance;
        }
        balance -= sum;
        return "Новый баланс = " + balance;
    }

    @Override
    public String setBalance(int sum) {
        balance = sum;
        return "Новый баланс = " + balance;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
