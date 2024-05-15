package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PathVariableController {

	
	  //@RequestMapping(value = {"/user/jang.do" ,"/user/hee.do","/user/kim.do"})
	
	
	@RequestMapping("{type}/{id}.do")
	public void test(@PathVariable String type,@PathVariable String id) { //@PathVariable ���� String id�ϰ�� url�� ?id= ���� ���� ���;��Ѵ�
		log.info("testȣ��Ǿ����ϴ�.... {} , {} ",type,id);
	  
	}
	 
	@RequestMapping("/{id}")
	public String bb(@PathVariable String id) {
		log.info("bb ȣ��Ǿ���....{}",id);
		
		return "result";
		
	};
	
	
	@RequestMapping("/board/{type}/{no}")
	public String aa(@PathVariable String type,@PathVariable int no , String name) {
		
		log.info("aa ȣ��Ǿ����ϴ�...{},{}",type,no);
		log.info("name = {}",name);
		
		//return "redirect:/rem/test.do";
		return "forward:/rem/test.do";
	}
	
	
	
}






