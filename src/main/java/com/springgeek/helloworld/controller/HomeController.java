package com.springgeek.helloworld.controller;

import org.springframework.web.bind.annotation.RestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @RequestMapping("/")
  String home() {
    return "Hello from Hareni!";
  }
  
}
