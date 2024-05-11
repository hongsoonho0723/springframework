package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //����
public class TestController {
 
	//���
	@RequestMapping("/test.do")
	public ModelAndView aa() {
		System.out.println("test.do ��û�� �Ծ��~~~");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","Spring�ű��ϴ�~~~"); //request.setAttribute()���� -> �信�� ${requestScope.message}
		mv.addObject("name","����"); //${name}
		
		mv.setViewName("index"); //prefix + ���̸� +suffix�� ���� -> /WEB-INF/views/index.jsp�̵�
		
		return mv;
		
		
	}
	
	
}
