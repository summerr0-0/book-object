package com.example.ch2.movie.step1.pricing;

import com.example.ch2.movie.step1.DiscountCondition;
import com.example.ch2.movie.step1.Screening;

public class SequenceCondition implements DiscountCondition {
    private int sequence;
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }


}
