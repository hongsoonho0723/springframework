package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //생성
public class HomeController {
	
	/**
	 * 리턴타입이 String이면 리턴값이 뷰이름이된다.
	 * */
	@RequestMapping("/") //요청 
	public String index() {
		System.out.println("HomeController index 요청되었습니다.~~~");
		return "index"; //WEB-INF/views/index.jsp이동
	}
	
}
