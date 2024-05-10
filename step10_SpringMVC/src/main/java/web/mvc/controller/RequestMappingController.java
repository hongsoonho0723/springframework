package web.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //생성
@RequestMapping("/rem")
public class RequestMappingController {

	@RequestMapping("/a.do")
	public ModelAndView aa() {
		System.out.println("a.do요청됨...");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","spring 신기하다");
		mv.setViewName("result"); //WEB-INF/views/result.jsp이동 ---> ${message}
		
		return mv;
	}
	
	
	/*
	 * 여러개의 요청이 같은 메소드를 실행
	 * 
	 * : 리턴타입 String인 경우 - 리턴되는 문자열이 뷰이름이 된다
	 * 
	 * */

	@RequestMapping(value = {"/b.do" , "/c.do"})
	public String aaa() {
		System.out.println("b.do or c.do 요청되었습니다");
		
		return "result";// WEB-INF/views/result.jsp이동
		
	}
	

	/*
	 * 요청방식 : method (get : select | post : insert | delete : delete| put : update | patch :update)
	 * 
	 * 리턴타입 void인 경우 : 요청된 주소가 뷰이름이 된다
	 * test.do라고 요청이 오면 "test" 가 뷰이름 
	 * 
	 * */
	@GetMapping("/test.do")
	public void test(HttpServletRequest request) {
		String name = request.getParameter("name");
		System.out.println("get 요청 rem/test.do 요청됨... name = "+ name);
		
	}
	
	@PostMapping("/test.do")
	public void test1(HttpServletRequest request) {
		String name = request.getParameter("name");
		System.out.println("post 요청 rem/test.do 요청됨... name = "+ name);
		
	}
	


}


















