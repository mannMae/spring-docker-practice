package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;

public interface MemberRepository {
    Member save(Member member);

    List<Member> findAll();
}
