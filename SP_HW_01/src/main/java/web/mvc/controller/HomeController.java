package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //����
public class HomeController {
	
	/**
	 * ����Ÿ���� String�̸� ���ϰ��� ���̸��̵ȴ�.
	 * */
	@RequestMapping("/") //��û 
	public String index() {
		System.out.println("HomeController index ��û�Ǿ����ϴ�.~~~");
		return "index"; //WEB-INF/views/index.jsp�̵�
	}
	
}
