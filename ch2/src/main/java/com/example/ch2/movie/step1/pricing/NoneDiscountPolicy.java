package com.example.ch2.movie.step1.pricing;

import com.example.ch2.money.Money;
import com.example.ch2.movie.step1.Screening;

public class NoneDiscountPolicy extends DiscountPolicy{

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
