package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{


    private final MemberRepository memberRepository;

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }

    @Autowired //ac.getBean(MemberRepository.class); 의존관계 자동 주입
    public MemberServiceImpl(MemberRepository memberRepository) { //생성자 주입.추상화 의존
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
    memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }


}
