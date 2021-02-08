package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/complex")
	public String showForm() {
		return "complex_form";
	}

	
	@RequestMapping(path = "/handleform",method = RequestMethod.POST)
//	public String formHandler(@RequestParam("name") String name,@RequestParam("password") String password,@RequestParam("email") String email,
//			  @RequestParam("contact") String contact,@RequestParam("date") String date
//			  ,@RequestParam("type") String type)
//	{
		
	public String formHandler(@ModelAttribute("student") student student)
	{
//		System.out.println(name);
//		System.out.println(password);
//		System.out.println(email);
//		System.out.println(contact);
//	    System.out.println(date);
//	    System.out.println(type);
		
		System.out.println(student);
		System.out.println(student.getAddress());
		return "Success";
	}
	
	
}
