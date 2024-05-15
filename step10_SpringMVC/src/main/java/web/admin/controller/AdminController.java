package web.admin.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import web.mvc.service.GoodsService;
@Slf4j
@Controller
public class AdminController {
	
	
	
	@Autowired //주입
	private GoodsService service;
	
	@PostConstruct
	public void init() {
		System.out.println("AdminController service = "+service);
		
	}
	
	
	

	@RequestMapping("/test.admin")
	public String test() {
		log.info("test.admin 요청됨...");
		
		
		return "result"; //WEB-INF/andmin/result.jsp이동
		
	}
	
	
	
	
}
