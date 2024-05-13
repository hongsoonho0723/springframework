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
 * ���� Controller�� ajax ������� Ŭ�����϶�
 * Ŭ���� ���� @RestController �����Ѵ�
 * */
//@Controller

@RestController // @Controller + @ResponseBody
@Slf4j
public class ResponseBodyController {

	
	@RequestMapping(value = "/responseBody.do", produces = "text/html;charset=utf-8")
	//@ResponseBody
	public String aa() {
		log.info("responseBody.do ��û��...");
		
		return "Hava a nice day ������!!!";
		
	}
	
	
	/*
	 * ����body�� List���·� ����
	 *  : �������� �˼� �ִ� ������ Ÿ���� JSON���·� 
	 *  ��ȯ�ؼ� ������ �ؾ� �Ѵ�
	 *  : spring������ jackson-databind lib�� �߰��ϸ� 
	 *  �ڵ����� JSON���� ��ȯ�� ���ش�
	 * */
	/*@RequestMapping("/responseBody2.do")
	//@ResponseBody
	public List<UserDTO> bb(){
		log.info("responseBody2.do ��û��...");
		
		List<UserDTO> list = new ArrayList<UserDTO>();
		list.add(new UserDTO("jang","����",20,"����"));
		list.add(new UserDTO("kim","����",25,"�뱸"));
		list.add(new UserDTO("hee","ȿ��",23,"����"));
		list.add(new UserDTO("king","����",30,"�λ�"));
				
		
		return list;
	}*/
	
	
	@RequestMapping("/responseBody2.do")
	
	public ResponseEntity<?> bb(){
		log.info("responseBody2.do ��û��...");
		
		List<UserDTO> list = new ArrayList<UserDTO>();
		list.add(new UserDTO("hong","����",20,"����"));
		list.add(new UserDTO("kim","����",25,"�뱸"));
		list.add(new UserDTO("hee","ȿ��",23,"����"));
		list.add(new UserDTO("king","����",30,"�λ�"));
				
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	
	
	////////////////////////////////////////
	
	
	@PostMapping("/ajax.do")
	public UserDTO cc(String email,String pwd) {
		log.info("ajax.do ��û��...");
		
		log.info("�μ� = {} , {} " ,email,pwd);
		//������
		//log.info("�μ� "+ email+" , "+pwd)
		
		
		
		return UserDTO.builder().addr("����").age(20).id("kim").name("ȿ��").build();
				
				
				
		
	}
	
	
	
	
	
}
