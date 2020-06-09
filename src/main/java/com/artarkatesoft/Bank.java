package com.artarkatesoft;

public class Bank {
    public Money reduce(Expression source, String toCurrency) {
        return source.reduce(toCurrency);
    }
}
