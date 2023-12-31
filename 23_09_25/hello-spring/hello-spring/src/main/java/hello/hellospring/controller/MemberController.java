package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) { this.memberService = memberService; }

    @GetMapping("/members/new")
    public String createForm() { return "members/createMembersForm"; }

    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        return "members/memberList";
    }
}
