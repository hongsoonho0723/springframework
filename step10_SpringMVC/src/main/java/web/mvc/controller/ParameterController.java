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
		return "result"; //���̸��̵ȴ� - WEB-INF/views/result.jsp 
	}
	
	/*
	 * void�� ���� ��û�ּҰ� ���̸��� �ȴ�
	 *  : WEB-INF/views/rem/b.jsp�̵�
	 *  
	 *  ��û�ּҰ� ���̸����� ���ε��ϱ⸦ �ٶ�鼭
	 *  �������� ���޵� ����-Model �� �ʿ��ϴ�
	 *  
	 * */
	
	@RequestMapping("/b.do")
	public void bb(Model model,@RequestParam(defaultValue = "Gsuest", value="userId") String id,@RequestParam(defaultValue = "0") int age) {
		System.out.println("id = "+id);
		System.out.println("age = "+age);
		
		model.addAttribute("message","�ָ��̴ٰ��´�");
		model.addAttribute("name","����");
		
		
	}
	
}



















