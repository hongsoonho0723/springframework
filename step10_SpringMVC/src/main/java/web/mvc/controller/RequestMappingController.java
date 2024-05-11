package web.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //����
@RequestMapping("/rem")
public class RequestMappingController {

	@RequestMapping("/a.do")
	public ModelAndView aa() {
		System.out.println("a.do��û��...");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","spring �ű��ϴ�");
		mv.setViewName("result"); //WEB-INF/views/result.jsp�̵� ---> ${message}
		
		return mv;
	}
	
	
	/*
	 * �������� ��û�� ���� �޼ҵ带 ����
	 * 
	 * : ����Ÿ�� String�� ��� - ���ϵǴ� ���ڿ��� ���̸��� �ȴ�
	 * 
	 * */

	@RequestMapping(value = {"/b.do" , "/c.do"})
	public String aaa() {
		System.out.println("b.do or c.do ��û�Ǿ����ϴ�");
		
		return "result";// WEB-INF/views/result.jsp�̵�
		
	}
	

	/*
	 * ��û��� : method (get : select | post : insert | delete : delete| put : update | patch :update)
	 * 
	 * ����Ÿ�� void�� ��� : ��û�� �ּҰ� ���̸��� �ȴ�
	 * test.do��� ��û�� ���� "test" �� ���̸� 
	 * 
	 * */
	@GetMapping("/test.do")
	public void test(HttpServletRequest request) {
		String name = request.getParameter("name");
		System.out.println("get ��û rem/test.do ��û��... name = "+ name);
		
	}
	
	@PostMapping("/test.do")
	public void test1(HttpServletRequest request) {
		String name = request.getParameter("name");
		System.out.println("post ��û rem/test.do ��û��... name = "+ name);
		
	}
	


}


















