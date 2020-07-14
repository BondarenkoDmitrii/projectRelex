package ru.relex.sample.rest.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldApi {

  @GetMapping(produces = "text/plain", path = "/{user}")
  public String sayHello(
    @PathVariable("user") final String user
//    @RequestParam(name = "user", defaultValue = "anonymous") final String user
  ) {
    return "Hello, " + user + "!";
  }
}
