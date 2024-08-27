package com.julioluis;

public abstract class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public abstract Money multiply(int times);

    @Override
    public boolean equals(Object obj) {
        Money result = (Money) obj;

        return this.amount == result.amount &&
                this.getClass().equals(result.getClass());
    }
}
