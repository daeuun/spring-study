package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

    // 순수한 자바로만 개발중.....
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl(memberRepository);
        // new Member 작성한 다음에, Member 에 둔 커서 두고 커맨드+옵션+V 하면 자동으로 생성해줌.
        Member member = new Member(1L, "memberA", Grade.VIP);

        // memberService 에 join 메서드에 생성한 member 를 넣어주면 가입됨
        memberService.join(member); // 회원가입

        // 회원가입 되었는지 확인하기
        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName() );
        System.out.println("find member = " +  findMember.getName());
    }
}
