package com.artarkatesoft;

public class Money implements Expression {
    protected int amount;
    protected final String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && this.currency == money.currency;
    }

    public String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, this.currency);
    }

    public Expression plus(Money added) {
        return new Money(this.amount + added.amount, this.currency);
    }
}
