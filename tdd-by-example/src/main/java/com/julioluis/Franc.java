package com.julioluis;

public class Franc extends Money {

    public Franc(int amount) {
        super(amount);
    }

    public static Franc getInstance(int amount) {
        return new Franc(amount);
    }

    @Override
    public Money multiply(int times) {
        return new Franc(amount * times);
    }
}
