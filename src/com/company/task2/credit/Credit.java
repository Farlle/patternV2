package com.company.task2.credit;

public class Credit {
    private int sum;
    private int percent;
    private int mountTime;
    private int mountPayment;

    Credit(int sum, int percent, int mountTime, int mountPayment){
        this.sum = sum;
        this.percent = percent;
        this.mountTime = mountTime;
        this.mountPayment = mountPayment;
    }

    public int getSum() {
        return sum;
    }

    public int getPercent() {
        return percent;
    }

    public int getMountTime() {
        return mountTime;
    }

    public int getMountPayment() {
        return mountPayment;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "sum=" + sum +
                ", percent=" + percent +
                ", mountTime=" + mountTime +
                ", mountPayment=" + mountPayment +
                '}';
    }
}
