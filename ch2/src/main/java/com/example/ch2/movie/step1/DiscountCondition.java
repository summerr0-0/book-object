package com.example.ch2.movie.step1;

import com.example.ch2.movie.step1.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
