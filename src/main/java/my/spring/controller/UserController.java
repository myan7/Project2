package my.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import my.spring.model.User;
import my.spring.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes({"user","item"})
public class UserController 
{
	@Autowired
	UserService userService;
	
	@RequestMapping("/signup")
	public String signUp(Model model)
	{
		model.addAttribute("user", new User());
		// add "kart ", kart
		return "signup";
	}
	
	@RequestMapping(value = "/display", method=RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user, BindingResult result)
	{
		
		if(result.hasErrors())
		{
			return "signup";
		}else
		{
			userService.add(user);
			return "display";
		}	
	}
	
	@RequestMapping("/login")
	public String isValid(@ModelAttribute("user") User user, BindingResult result, Model model, HttpServletRequest request)
	{
		System.out.println("I am in /user/login");
		System.out.println("1"+user);
		User u = userService.isValid(user);
		if(u != null)
		{
			System.out.println((User)(request.getSession().getAttribute("user")));
			request.getSession().removeAttribute("user");  // first destroy the object you retrieve from the form
			model.addAttribute("user", u);				// add the object you retrieve from the database into session
//			request.getSession().setAttribute("user", u);
//			System.out.println("2"+u);
			return "display";
		}
		else
		{
			return "index";
		}
	}

//	@RequestMapping("/displayPSW")  // link to the forgot password mapping.
	
	@RequestMapping("/cart")
	public String displayCart(@ModelAttribute("user") User user, Model model)
	{
		
		if(user.getUserId()==0)
		{
			model.addAttribute("user", user);
			return "login";
		}
		
		return "cart";
	}
	
	
}
