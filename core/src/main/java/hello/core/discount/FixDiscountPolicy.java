package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmounts = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) { // Enum type은 == 쓰는게 맞음
            return discountFixAmounts;
        } else {
            return 0;
        }
    }
}
