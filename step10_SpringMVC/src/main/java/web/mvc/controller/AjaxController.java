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
		log.info("�μ� {} ",userDTO);
		
		
		return "oK";
		
	}
	
	/*
	 * @RequestBody�� ����Ʈ���� ���޵Ǵµ����Ͱ� json�ΰ��
	 * */
	@PostMapping("/ajax3.do")
	public String ajax3(@RequestBody UserDTO userDTO) { //@RequestBody jsonŸ������ �������
		log.info("�μ� ajax3 {} ",userDTO);
		
		//���̰� 18���� ������ ���ܹ߻�
		if(userDTO.getAge()<18) {
			throw new IllegalArgumentException("�̼����ڴ� �����Ҽ� �����~~"); //���������� ���� �������� ����ϴ� ����
		}
		
		return "oK2";
		
	}
	
	
}
