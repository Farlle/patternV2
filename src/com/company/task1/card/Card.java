package com.company.task1.card;

public interface Card {
    String increaseBalance(int sum);
    String decreaseBalance(int sum);
    String setBalance(int sum);
    int getBalance();
}
