package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	/**
	 * ȸ������ ��
	 * */
	@RequestMapping("/register")
	public void register() {}
	
	
	/**
	 * ����
	 * */
	@RequestMapping("/personal/personal")
	public void personal() {}
	
	
}


