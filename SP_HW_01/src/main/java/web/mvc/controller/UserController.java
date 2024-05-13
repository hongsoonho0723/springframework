package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	/**
	 * 회원가입 폼
	 * */
	@RequestMapping("/register")
	public void register() {}
	
	
	/**
	 * 개인
	 * */
	@RequestMapping("/personal/personal")
	public void personal() {}
	
	
}


