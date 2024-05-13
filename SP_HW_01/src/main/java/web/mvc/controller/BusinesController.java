package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BusinesController {

	/**
	 * 리턴값이 void이면 요청주소가
	 * 뷰이름이된다.
	 * */
	@RequestMapping("/busines")
	public void busines() {
	   System.out.println("BusinesController .....");
	}
}
