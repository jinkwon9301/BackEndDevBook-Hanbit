package kr.co.hanbit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

//  @RequestMapping("/")
//  public String hello() {
//    return "Hello";
//  }

  @RequestMapping("/")
  public String hello() {
    return "Hello <strong>Backend</strong>";
  }

  @RequestMapping("/bye")
  public String bye() {
    return "Bye";
  }

//  @RequestMapping("/bye")
//  public String bye2() {
//    return "Bye2";
//  }

//  @RequestMapping("/article")
//  public String createArticle() {
//    return "SOME MESSAGE.";
//  }

  @RequestMapping("/article")
  public String createArticle(@RequestParam("title") String title,
                              @RequestParam("content") String content) {
    return String.format("title=%s / content=%s", title, content);
  }
}
