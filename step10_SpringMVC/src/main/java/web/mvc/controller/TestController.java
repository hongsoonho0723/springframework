package web.mvc.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import web.mvc.service.GoodsService;

@Controller //생성
@Slf4j
public class TestController {
 
	@Autowired //주입
	private GoodsService service;
	
	@PostConstruct
	public void init() {
		System.out.println("TestController service = "+service);
		
	}
	
	
	//기능
	@RequestMapping("/")
	public ModelAndView aa() {
		System.out.println("test.do 요청이 왔어요~~~");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","Spring신기하다~~~"); //request.setAttribute()동일 -> 뷰에서 ${requestScope.message}
		mv.addObject("name","희정"); //${name}
		
		mv.setViewName("index"); //prefix + 뷰이름 +suffix를 조합 -> /WEB-INF/views/index.jsp이동
		
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
