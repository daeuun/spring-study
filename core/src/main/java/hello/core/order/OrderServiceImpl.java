package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository; // 회원정보 랑
    private final DiscountPolicy discountPolicy; // final은 무조건 값이 할당되어야 함.

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId); // member 찾기
        int discountPrice = discountPolicy.discount(member, itemPrice); // 최종 할인된 가격에 대한 정보
        // order 는 할인에 대해서는 잘 모르는데 일단 그냥 넣어주기만 하면 됨

        // DiscountPolicy 에만 의존하기 위해 구현 클래스 의존 다 지우고 테스트 하면,
        // discountPolicy 에 아무값도 할당이 안되어 있어서 테스트 돌리면 당연히 NPE 에러남

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
