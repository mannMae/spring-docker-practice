package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;

import java.util.List;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) { this.memberRepository = memberRepository; }

    public List<Member> findMembers() { return memberRepository.findAll(); }
}
