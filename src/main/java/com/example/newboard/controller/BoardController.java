package com.example.newboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {


    /**
     * 로그인을 처리하는 메소드
     *
     * @param
     */

    @GetMapping("/")
    public String loginForm() {
        return "login";
    }

    @RequestMapping("/login")
    public String check(@RequestParam(value = "username", required = false) String username, @RequestParam(value = "password", required = false) String password, Model model) {

        if (username != null && password != null) {
            model.addAttribute("username");
            model.addAttribute("password");
            model.addAttribute("msg", "로그인 완료");
        } else {
            model.addAttribute("msg", "아이디나 패스워드를 확인해주세요");
        }

        System.out.println("username :" + username);
        System.out.println("Password :" + password);
        return "login";


    }
}