package com.kh.mini.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class TestController {
    @GetMapping("/name")
    public String getName() {
        return "Get방식이고, 이름은 김입니다";
    }

    // 매개변수를 URL 자체에 값을 담아 요청하는 방식
    @GetMapping("/variable/{var}")
    public String getVar(@PathVariable String var) {
        return "요청하신 페이지 번호는 " + var + "입니다.";
    }

    // Get방식으로 정보를 전달하는 방식
    @GetMapping("/request")
    public String getRequestParam(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String company) {
        return name + " " + email + " " + company;
    }

}
