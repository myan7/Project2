package my.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import my.spring.model.AbstractItem;
import my.spring.model.Cart;
import my.spring.model.User;
import my.spring.service.CartService;
import my.spring.service.ItemService;
import my.spring.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes({"user","item"})
public class UserController 
{
	@Autowired
	UserService userService;
	@Autowired
	ItemService itemService;
	@Autowired
	CartService cartService;
	
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
			String message = "Please login first";
			model.addAttribute(message);
			return "login";
		}
		return "cart";
	}
	
	@RequestMapping("/login2")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("add2cart/{id}")
	public String add2Cart(@PathVariable long id, @ModelAttribute("user") User user, @RequestParam(value = "quantity", required=false) int quantity, Model model ) 
	{
		
		if(user.getUserId()==0)
		{
			return "login";
		}
		
		AbstractItem item = itemService.getItem(id);  // got the item should be added to the user cart
		int inventory = item.getItemInventory();
		if(inventory < quantity)
		{
			String message = "Only "+inventory+ item.getItemCategory() +" is in stock.";
		}
		else
		{
			cartService.update(user.getUserCart(), item, quantity);
		}
		System.out.println(user.getUserCart().getItems().keySet().size()+"from controller");
		return "cart";		
	}
	
	@RequestMapping("removeFromCart/{id}")
	public String removeFromCart(@PathVariable long id, @ModelAttribute("user") User user)
	{
		cartService.removeFromCart(id, user.getUserCart());
		return "redirect:/Project2/user/cart";
	}
	
	
}
