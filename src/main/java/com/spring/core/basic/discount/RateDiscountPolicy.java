package com.spring.core.basic.discount;

import com.spring.core.basic.member.Member;

import static com.spring.core.basic.member.Grade.VIP;

public class RateDiscountPolicy implements DiscountPolicy {

    // 할인율
    private double discountPercent = 0.2;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == VIP) {
            return (int) (price * discountPercent);
        } else {
            return 0;
        }
    }
}
