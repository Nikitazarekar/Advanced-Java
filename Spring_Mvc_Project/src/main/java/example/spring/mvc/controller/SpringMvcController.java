package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.spring.mvc.model.User;
import example.spring.mvc.model.UserValidate;

@Controller
public class SpringMvcController {
	
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
//	/WEB_INF/views/login.jsp
	
	@PostMapping("/validate")
	public String getValidate(
			@RequestParam("uid")String uid,//admin
			@RequestParam("pwd")String pass//password
			) {
		String result="failure";
		User u=new User(uid,pass);
		if(UserValidate.isValid(u))	
		 result="success";
		return result;
	}
}
