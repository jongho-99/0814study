package com.kh.app01.member.controller;

import com.kh.app01.member.dto.ReqMemberDto;
import com.kh.app01.member.dto.RespMemberDto;
import com.kh.app01.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/member")
public class MemberApiController {

    private final MemberService memberService;

    @PostMapping("join")
    private void join(@RequestBody ReqMemberDto reqDto) {
        memberService.join(reqDto);
    }

    //resp 에서 반환할때 ReqMemberDto에대해서 반환해야하므로 JACKSON이 JSON 파싱에 GETTER르
    @PostMapping("login")
    private RespMemberDto login (@RequestBody ReqMemberDto reqDto) {
        return memberService.login(reqDto);
    }


}
