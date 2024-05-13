package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller //����
@Slf4j
public class TestController {
 
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
