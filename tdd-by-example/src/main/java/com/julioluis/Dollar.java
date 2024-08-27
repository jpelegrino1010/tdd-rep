package com.julioluis;

public class Dollar extends Money {
    public Dollar(int amount) {
        super(amount);
    }

    public static  Dollar getInstance(int amount) {
        return new Dollar(amount);
    }

    @Override
    public Money multiply(int times) {
        return new Dollar(times * this.amount);
    }
}
