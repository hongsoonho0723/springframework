package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //생성
public class TestController {
 
	//기능
	@RequestMapping("/test.do")
	public ModelAndView aa() {
		System.out.println("test.do 요청이 왔어요~~~");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","Spring신기하다~~~"); //request.setAttribute()동일 -> 뷰에서 ${requestScope.message}
		mv.addObject("name","희정"); //${name}
		
		mv.setViewName("index"); //prefix + 뷰이름 +suffix를 조합 -> /WEB-INF/views/index.jsp이동
		
		return mv;
		
		
	}
	
	
}
