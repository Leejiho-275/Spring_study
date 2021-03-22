package com.spring.core.basic.member;

public class MemberServiceImpl implements MemberService {

    // 회원 서비스 구현체
    // 역할 : 적당한 회원 저장소에 저장 명령을 내리는 기능
    private MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
