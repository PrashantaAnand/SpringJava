package springmvc.controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","HeLlO SiGn In");
		m.addAttribute("desc", "Home for programmer");
	}
	

	@RequestMapping("/contact")
	public String showForm(Model m) {
		
		
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

//      model.addAttribute("user", user);
		
//		if want same thing in the sucesss page 
//		model.addAttribute("Header","HeLlO SiGn In");
//		model.addAttribute("desc", "Home for programmer");
		return "success";
	}

}













































/*
@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		
		
		return "contact";
	}
	
@RequestMapping(path = "/processform",method = RequestMethod.POST)
public String handleForm(
		@RequestParam(name="email",required = false) String userEmail, 
		@RequestParam("userName") String userName, 
        @RequestParam("password") String userPassword, Model model) 
{
	User user = new User();
	user.setEmail(userEmail);
	user.setUserName(userName);
	user.setPassword(userPassword);
   //process
//   model.addAttribute("name", userName);
//   model.addAttribute("email", userEmail);
//   model.addAttribute("password", userPassword);
	
	model.addAttribute("user", user); 
   
	return "success";
}

}
*/