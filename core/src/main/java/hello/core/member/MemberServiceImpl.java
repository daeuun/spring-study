package hello.core.member;

public class MemberServiceImpl implements MemberService{

    // 인터페이스 생성 = 구현객체 선택하기
    // => 구현객체 지정하던거 지우고 추상화에만 의존하기!
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
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
