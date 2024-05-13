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
	
	/*
	 * ������
	 *  : ������ ���۵� �����͸� ��ü�� ���ε��ϸ�
	 *    ���޵� ��ü�� Model�� ����Ǿ� ���ʿ��� ����Ҽ� �ִ�
	 * 	  ���� : ��ü�̸��� ù���ڸ� �ҹ��ڷ� ����
	 * 				ex)UserDTO �ΰ�� userDTO.�Ӽ�
	 * */
	@PostMapping("/user.do")
	public ModelAndView user(@ModelAttribute("user") UserDTO user,String id ) { //���������� form���� �Ѿ���� ���� DTO�� 
											//property�� ������ ��Ī�����ش� �� Setter�� �ݵ�� �����ؾ���
		System.out.println("user = "+user);
		System.out.println("id = "+id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userResult"); // WEB-INF/views/userResult.jsp �̵�
		
		
		return mv;
	}
	
	
	
	@ModelAttribute("info")//�����ϴ� ���� ���ʿ��� ${info} ���
	public String test() {
		return "��ſ� ������~";
	}

	@ModelAttribute("menus") // ${menus}
	public List<String> menus(){
		return Arrays.asList("«��","�ѽ�","�Ͻ�");
	}
	
	
	
	
}



















