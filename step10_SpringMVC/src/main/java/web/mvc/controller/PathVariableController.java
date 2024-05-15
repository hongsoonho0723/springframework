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
	public void test(@PathVariable String type,@PathVariable String id) { //@PathVariable 없이 String id일경우 url에 ?id= 으로 값이 들어와야한다
		log.info("test호출되었습니다.... {} , {} ",type,id);
	  
	}
	 
	@RequestMapping("/{id}")
	public String bb(@PathVariable String id) {
		log.info("bb 호출되었음....{}",id);
		
		return "result";
		
	};
	
	
	@RequestMapping("/board/{type}/{no}")
	public String aa(@PathVariable String type,@PathVariable int no , String name) {
		
		log.info("aa 호출되었습니다...{},{}",type,no);
		log.info("name = {}",name);
		
		//return "redirect:/rem/test.do";
		return "forward:/rem/test.do";
	}
	
	
	
}






