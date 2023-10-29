package com.example.ch2.movie.step2;

import com.example.ch2.money.Money;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
