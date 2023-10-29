package com.example.ch2.movie.step2.pricing;

import com.example.ch2.movie.step2.DiscountCondition;
import com.example.ch2.movie.step2.Screening;

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
