package web.mvc.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import web.mvc.service.GoodsService;

@Controller //����
@Slf4j
public class TestController {
 
	@Autowired //����
	private GoodsService service;
	
	@PostConstruct
	public void init() {
		System.out.println("TestController service = "+service);
		
	}
	
	
	//���
	@RequestMapping("/")
	public ModelAndView aa() {
		System.out.println("test.do ��û�� �Ծ��~~~");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","Spring�ű��ϴ�~~~"); //request.setAttribute()���� -> �信�� ${requestScope.message}
		mv.addObject("name","����"); //${name}
		
		mv.setViewName("index"); //prefix + ���̸� +suffix�� ���� -> /WEB-INF/views/index.jsp�̵�
		
		return mv;
		
		
	}
	@RequestMapping("/test2.do")
	public String aa(String no) {
		//System.out.println("ExceptionController no = "+no);
		log.info("no = "+ no);
		
		int convertNo = Integer.parseInt(no);
		log.info("convertNo = "+convertNo);
		
		int result = 100/ convertNo;
		
		
		return "result";
	}
	
}
