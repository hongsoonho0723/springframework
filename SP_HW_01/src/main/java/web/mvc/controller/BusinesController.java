package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BusinesController {

	/**
	 * ���ϰ��� void�̸� ��û�ּҰ�
	 * ���̸��̵ȴ�.
	 * */
	@RequestMapping("/busines")
	public void busines() {
	   System.out.println("BusinesController .....");
	}
}
