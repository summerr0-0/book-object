package com.example.ch2.movie.step1.pricing;

import com.example.ch2.movie.step1.DiscountCondition;
import com.example.ch2.money.Money;
import com.example.ch2.movie.step1.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
