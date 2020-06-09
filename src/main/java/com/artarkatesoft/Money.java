package com.artarkatesoft;

public class Money {
    protected int amount;

    //    public Money(int amount) {
//        this.amount = amount;
//    }
//
//    public Money times(int multiplier) {
//        return new Money(amount * multiplier);
//    }
//
    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount;
    }
}
