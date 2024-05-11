package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/param")
public class ParameterController {

	@RequestMapping("/a.do")
	//public String aa(String name, int age) {
	public String aa(String name, Integer age) {
		
		System.out.println("name = "+name);
		System.out.println("age = "+age);
		return "result"; //뷰이름이된다 - WEB-INF/views/result.jsp 
	}
	
	/*
	 * void인 경우는 요청주소가 뷰이름이 된다
	 *  : WEB-INF/views/rem/b.jsp이동
	 *  
	 *  요청주소가 뷰이름으로 바인딩하기를 바라면서
	 *  뷰쪽으로 전달될 정보-Model 도 필요하다
	 *  
	 * */
	
	@RequestMapping("/b.do")
	public void bb(Model model,@RequestParam(defaultValue = "Gsuest", value="userId") String id,@RequestParam(defaultValue = "0") int age) {
		System.out.println("id = "+id);
		System.out.println("age = "+age);
		
		model.addAttribute("message","주말이다가온다");
		model.addAttribute("name","희정");
		
		
	}
	
}



















