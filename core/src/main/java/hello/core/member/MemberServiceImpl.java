package hello.core.member;

public class MemberServiceImpl implements MemberService{

    // 인터페이스 생성 = 구현객체 선택하기
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    // new 로 할당하는 부분이 구현체를 의존하고 있음
    // 그래서 MemberServiceImpl 은 MemberRepository, MemoryMemberRepository 추상화, 구체화 둘 다 의존 중이다!
    // * DIP 위반!!

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
