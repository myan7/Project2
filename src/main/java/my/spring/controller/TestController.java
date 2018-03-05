package my.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import my.spring.model.AbstractItem;
import my.spring.model.Desktop;
import my.spring.model.Headphone;
import my.spring.model.User;
import my.spring.service.ItemService;


@Controller
@SessionAttributes("user")
public class TestController {
	
	@Autowired
	ItemService iService;
	
	@RequestMapping(value= "/")
	public String sayHello(Model model, HttpServletRequest request)
	{
		if(request.getSession().getAttribute("user")==null)
		{
			model.addAttribute("user", new User());
			System.out.println("User should be null.");
		}
		List<AbstractItem> items = iService.getAll();
		model.addAttribute("items",items);
		System.out.println(items);
		return "index";
	}
	
	
	@RequestMapping("/header")
	public String printGreeting(Model model)
	{
		model.addAttribute("hello", "Hello Mr.MY");
		return "header";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/{id}")
	public String testImg(@PathVariable("id") long id , Model model)
	{
		AbstractItem item = iService.getItem(id);
		
//		System.out.println(item.getItemCategory());
		if(item.getItemCategory().equalsIgnoreCase("desktop"))
		{
			item = (Desktop)item; 
		}
		else if(item.getItemCategory().equalsIgnoreCase("headphone"))
		{
			item = (Headphone)item;
		}
		
//			Desktop item = (Desktop) iService.getItem(id);
		
		System.out.println("testController 1 1 1 1 1 1 1 11 1 ");
		model.addAttribute("item", item);
		return "testImg";
	}

}
