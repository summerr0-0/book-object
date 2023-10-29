package com.example.ch2.movie.step1.pricing;

import com.example.ch2.movie.step1.DiscountCondition;
import com.example.ch2.money.Money;
import com.example.ch2.movie.step1.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
