package com.example.ch2.movie.step2.pricing;

import com.example.ch2.money.Money;
import com.example.ch2.movie.step2.DiscountPolicy;
import com.example.ch2.movie.step2.Screening;


public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
