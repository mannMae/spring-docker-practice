package hello.hellospring.service;

import hello.hellospring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) { this.memberRepository = memberRepository; }

    @Bean
    public MemberService memberService() { return new MemberService(memberRepository); }
}
