package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {this.memberRepository = memberRepository; }

    /**
    * 회원 가입
     */
    
    public Long join(Member member){
        validateDuplicateMember(member);

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName()).ifPresent(m -> {
            throw new IllegalStateException("이미 존재 하는 회원 이름 입니다.");
        });
    }

    /**
    * 전체 회원 조회
     */

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    /**
    * 회원 조회
     */

    public Optional<Member> findOne(Long memberId) { return memberRepository.findById(memberId); }
}
