package com.artarkatesoft;

public class Sum implements Expression {
    Money augment;
    Money addend;

    public Sum(Money augment, Money addend) {
        this.augment = augment;
        this.addend = addend;
    }

    @Override
    public Money reduce(String to) {
        int amount = augment.amount + addend.amount;
        return new Money(amount, to);
    }
}
