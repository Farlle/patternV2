package com.company.task2.client;

public class Client {
    private String name;
    private int passportNum;
    private int income;
    private int creditRating;

    public Client(String name, int passportNum, int income, int creditRating) {
        this.name = name;
        this.passportNum = passportNum;
        this.income = income;
        this.creditRating = creditRating;
    }

    public String getName() {
        return name;
    }

    public int getPassportNum() {
        return passportNum;
    }

    public int getIncome() {
        return income;
    }

    public int getCreditRating() {
        return creditRating;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", passportNum=" + passportNum +
                ", income=" + income +
                ", creditRating=" + creditRating +
                '}';
    }
}
