package web.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import web.mvc.dto.UserDTO;

/*
 * 현재 Controller가 ajax 통신전용 클래스일때
 * 클래스 위에 @RestController 선언한다
 * */
//@Controller

@RestController // @Controller + @ResponseBody
@Slf4j
public class ResponseBodyController {

	
	@RequestMapping(value = "/responseBody.do", produces = "text/html;charset=utf-8")
	//@ResponseBody
	public String aa() {
		log.info("responseBody.do 요청됨...");
		
		return "Hava a nice day 좋은날!!!";
		
	}
	
	
	/*
	 * 응답body를 List형태로 리턴
	 *  : 브라우저가 알수 있는 데이터 타입인 JSON형태로 
	 *  변환해서 응답을 해야 한다
	 *  : spring에서는 jackson-databind lib를 추가하면 
	 *  자동으로 JSON으로 변환을 해준다
	 * */
	/*@RequestMapping("/responseBody2.do")
	//@ResponseBody
	public List<UserDTO> bb(){
		log.info("responseBody2.do 요청됨...");
		
		List<UserDTO> list = new ArrayList<UserDTO>();
		list.add(new UserDTO("jang","희정",20,"오리"));
		list.add(new UserDTO("kim","나영",25,"대구"));
		list.add(new UserDTO("hee","효리",23,"서울"));
		list.add(new UserDTO("king","민희",30,"부산"));
				
		
		return list;
	}*/
	
	
	@RequestMapping("/responseBody2.do")
	
	public ResponseEntity<?> bb(){
		log.info("responseBody2.do 요청됨...");
		
		List<UserDTO> list = new ArrayList<UserDTO>();
		list.add(new UserDTO("hong","희정",20,"오리"));
		list.add(new UserDTO("kim","나영",25,"대구"));
		list.add(new UserDTO("hee","효리",23,"서울"));
		list.add(new UserDTO("king","민희",30,"부산"));
				
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	
	
	////////////////////////////////////////
	
	
	@PostMapping("/ajax.do")
	public UserDTO cc(String email,String pwd) {
		log.info("ajax.do 요청됨...");
		
		log.info("인수 = {} , {} " ,email,pwd);
		//같은값
		//log.info("인수 "+ email+" , "+pwd)
		
		
		
		return UserDTO.builder().addr("서울").age(20).id("kim").name("효리").build();
				
				
				
		
	}
	
	
	
	
	
}
