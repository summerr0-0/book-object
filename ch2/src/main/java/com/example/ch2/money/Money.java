package com.example.ch2.money;

import java.math.BigDecimal;

public class Money {
    public static final Money ZERO = Money.wons(0);

    private final BigDecimal amount;

    public Money plus(Money amount) {
        return new Money(this.amount.add(amount.amount));
    }

    public Money minus(Money amount) {
        return new Money(this.amount.subtract(amount.amount));
    }

    public Money times(double percent) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    public Boolean isLessThan(Money other) {
        return this.amount.compareTo(other.amount) < 0;
    }

    public Boolean isGreaterThanOrEqualThan(Money other) {
        return amount.compareTo(other.amount) >= 0;
    }


    public static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money wons(double amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

}
