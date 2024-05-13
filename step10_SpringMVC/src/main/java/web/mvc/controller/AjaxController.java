package web.mvc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import web.mvc.dto.UserDTO;

@RestController
@Slf4j
public class AjaxController {

	@PostMapping("/ajax2.do")
	public String ajax2(UserDTO userDTO) {
		log.info("인수 {} ",userDTO);
		
		
		return "oK";
		
	}
	
	/*
	 * @RequestBody는 프론트에서 전달되는데이터가 json인경우
	 * */
	@PostMapping("/ajax3.do")
	public String ajax3(@RequestBody UserDTO userDTO) { //@RequestBody json타입으로 받을경우
		log.info("인수 ajax3 {} ",userDTO);
		
		//나이가 18보다 작으면 예외발생
		if(userDTO.getAge()<18) {
			throw new IllegalArgumentException("미성년자는 입장할수 없어요~~"); //원하지않은 값이 들어왔을때 사용하는 예외
		}
		
		return "oK2";
		
	}
	
	
}
