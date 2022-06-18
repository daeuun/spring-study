package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository(); // 회원정보 랑
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); // 고정할인정책 구현체로 생성해서 사용함

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId); // member 찾기
        int discountPrice = discountPolicy.discount(member, itemPrice); // 최종 할인된 가격에 대한 정보
        // order 는 할인에 대해서는 잘 모르는데 일단 그냥 넣어주기만 하면 됨

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
