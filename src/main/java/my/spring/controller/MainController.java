package my.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import my.spring.model.AbstractItem;
import my.spring.model.Desktop;
import my.spring.model.Headphone;
import my.spring.model.User;
import my.spring.service.ItemService;


@Controller
@SessionAttributes({"user","items"})
public class MainController {
	
	@Autowired
	ItemService iService;
	
	@RequestMapping(value= {"/","/home"})
	public String sayHello(Model model, HttpServletRequest request)  //modelAttribute will not accept null
	{
		if(request.getSession().getAttribute("user")==null)
		{
			model.addAttribute("user", new User());
		}
		
		
		List<AbstractItem> items = iService.getAll();
		int size = items.size();
		System.out.println("size is "+size);
		int pages = (int) Math.ceil((double)size/6);
		System.out.println("pages are "+pages);
		
		model.addAttribute("pages", pages);
		
		List<AbstractItem> itemList = items.subList(0, 6);
		model.addAttribute("items",items);
		model.addAttribute("itemList", itemList);

		return "index";
	}
	
	@RequestMapping("/page={page}")
	public String pagination(@ModelAttribute("items") List<AbstractItem> items, Model model, HttpServletRequest request, @PathVariable(value = "page") int page )  //modelAttribute will not accept null
	{
		if(request.getSession().getAttribute("user")==null)
		{
			model.addAttribute("user", new User());
		}

		int size = items.size();
		int pages = (int) Math.ceil((double)size/6);
		model.addAttribute("pages", pages);
		
		List<AbstractItem> itemList = items;
		int start = page*6-6;
		int end = page*6;
		if(end<=size)
		{
			itemList = items.subList(start, end);
		}else
			itemList = items.subList(start, size);
		
		model.addAttribute("itemList", itemList);
		
		return "index";
	}
	
	
	@RequestMapping("/header")
	public String printGreeting(Model model)
	{
		model.addAttribute("hello", "Hello Mr.MY");
		return "header";
	}
	
	@RequestMapping("/{id}")
	public String testImg(@PathVariable("id") long id , Model model)
	{
		AbstractItem item = iService.getItem(id);
		
		if(item.getItemCategory().equalsIgnoreCase("desktop"))
		{
			item = (Desktop)item; 
		}
		else if(item.getItemCategory().equalsIgnoreCase("headphone"))
		{
			item = (Headphone)item;
		}

		model.addAttribute("item", item);
		return "testImg";
	}
	
	@RequestMapping("/navCart")
	public String navCart(@ModelAttribute User user, BindingResult result)
	{
		if(user.getUserId() ==0)
		{
			return "login";
		}
		return "cart";
	}

	@RequestMapping("/category={cat}")
	public String categoryView(@PathVariable String cat, Model model)
	{
		List<AbstractItem> itemList = iService.getByCategory(cat);
		model.addAttribute("itemList", itemList);
		return "index";
	}
	
	@RequestMapping("search={key}")
	public String search(@PathVariable String key, Model model,HttpServletRequest request)
	{
		key = request.getParameter("key");
		List<AbstractItem> itemList = iService.getByKey(key);
		model.addAttribute("itemList", itemList);
		return "index";
	}
	
}
