package
com.springgeek.helloworld.controller;

import
org.springframework.web.bind.annotation.GetMapping;
import
org.springframework.web.bind.annotation.RestController;

@RestController
public clas HomeController {

  @GetMApping("/")
  public String home() {
    return "Hello from Hareni!";
  }
}
