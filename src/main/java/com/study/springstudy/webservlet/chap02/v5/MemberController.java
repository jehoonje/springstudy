package com.study.springstudy.webservlet.chap02.v5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chap02/v5/*")
public class MemberController {

    // 회원등록폼을 열어주는 요청
    @RequestMapping("/join")
    public String join() {
        return "v5/reg_form";
    }
}