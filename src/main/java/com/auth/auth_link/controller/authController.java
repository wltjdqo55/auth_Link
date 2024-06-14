package com.auth.auth_link.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class authController {

  @GetMapping("/")
  public String index(){
    return "/index.html";
  }
  @GetMapping("/auth/login")
  public String login(){
    return "/auth/login.html";
  }
}
