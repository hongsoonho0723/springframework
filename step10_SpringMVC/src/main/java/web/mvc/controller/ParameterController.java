package web.mvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import web.mvc.dto.UserDTO;

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
	
	/*
	 * 폼전송
	 *  : 폼으로 전송된 데이터를 객체로 바인딩하면
	 *    전달된 객체는 Model에 저장되어 뷰쪽에서 사용할수 있다
	 * 	  사용법 : 객체이름의 첫글자만 소문자로 접근
	 * 				ex)UserDTO 인경우 userDTO.속성
	 * */
	@PostMapping("/user.do")
	public ModelAndView user(@ModelAttribute("user") UserDTO user,String id ) { //스프링에서 form으로 넘어오는 값을 DTO에 
											//property과 같으면 매칭시켜준다 단 Setter가 반드시 존재해야함
		System.out.println("user = "+user);
		System.out.println("id = "+id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userResult"); // WEB-INF/views/userResult.jsp 이동
		
		
		return mv;
	}
	
	
	
	@ModelAttribute("info")//리턴하는 값을 뷰쪽에서 ${info} 사용
	public String test() {
		return "즐거운 월요일~";
	}

	@ModelAttribute("menus") // ${menus}
	public List<String> menus(){
		return Arrays.asList("짬뽕","한식","일식");
	}
	
	
	
	
}



















