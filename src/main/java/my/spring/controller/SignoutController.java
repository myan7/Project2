package my.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import my.spring.model.User;

@Controller
@RequestMapping("/signout")
public class SignoutController {
	
	@RequestMapping(method=RequestMethod.GET)
    public String logout(SessionStatus session, HttpServletRequest request) {
//      session.setComplete();
		
		System.out.println("logout");
		request.getSession().setAttribute("user", null);
//		model.addAttribute("user", null);
		
      
      return "redirect:/home";
    }
}
