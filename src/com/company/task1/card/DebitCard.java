package com.company.task1.card;

public class DebitCard implements Card {

    private int balance;
    private int number;
    //private int credit;

    DebitCard(int number) {
        this.number = number;
    }

    @Override
    public String increaseBalance(int sum) {
        balance += sum;
        return "Новый баланс = " + balance;
    }

    @Override
    public String decreaseBalance(int sum) {
        if (balance < sum) {
            return "Недостаточно денег!";
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
