package com.eomcs.pms.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberFormController {
  @GetMapping("/member/form")
  public ModelAndView form() {
    ModelAndView mv = new ModelAndView();
    mv.addObject("pageTitle", "새회원");
    mv.addObject("contentUrl", "member/MemberForm.jsp");
    mv.setViewName("template1");
    return mv;
  }
}







