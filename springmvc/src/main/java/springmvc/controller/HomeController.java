package springmvc.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	


	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home controller");
		
	model.addAttribute("name", "Prashant Anand");
	model.addAttribute("id", 1234);
	List<String> student = new ArrayList<String>();
	student.add("ram");
	student.add("hey");
	student.add("hello");
	 model.addAttribute("list",student);
		return "index";
	}
	
	@RequestMapping("/about") 
	public String about() {
		System.out.println("this is about page");
		return "about";
	}

	@RequestMapping("/service")
	public String service() {
		System.out.println("this is service page");
		return "service";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
   	  System.out.println("This is help page ");
   	  
   	  ModelAndView modelAndView = new ModelAndView();
   	  
   	  modelAndView.addObject("name", "prashant");
   	  modelAndView.addObject("contact", 123456);
   	  
   	  
   	  
   	  List<Integer> marks=new ArrayList();
   	  marks.add(1234);
   	  marks.add(5678);
   	  marks.add(22222);
   	  marks.add(191991);
   	  
   	  modelAndView.addObject("marks", marks);
   	  
   	  
   	  modelAndView.setViewName("help");
	  
   	  return modelAndView;
	  
	  
	 
}

	
}