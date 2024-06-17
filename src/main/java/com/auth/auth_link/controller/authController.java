package com.auth.auth_link.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

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


  @GetMapping("/auth/setToken")
  public String setToken(@RequestParam("name") String name){
    System.out.println("이름 : " + name);
    return "/auth/success.html";
  }

  @GetMapping("/auth/success")
  public String authSuccess(){
    return "/auth/success.html";
  }

}
