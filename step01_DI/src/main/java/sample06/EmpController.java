package sample06;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmpController {
	@Autowired //byType(동일한 객체가 여러개면 byName주입 )을 찾고 없으면 byName 주입
	@Qualifier("emp2")
	private EmpDTO empDTO;
	
	@Autowired
	private EmpDTO emp;
	
	@Autowired
	private EmpService empService;
	
	public EmpController() {
		System.out.println("EmpController 기본 생성자");
		System.out.println("empDTO = "+empDTO);
		System.out.println("empService = "+empService);
		
	}
	@PostConstruct
	public void init() {
		System.out.println("난 객체가 생성과 주입이 완료 된 후에 실행됩니다!!!");
		System.out.println("empDTO = "+empDTO);
		System.out.println("empService = "+empService);
	}
	
	
	public void empTest() {
		System.out.println("empDTO = "+empDTO);
		System.out.println("emp = "+emp);
		
		
		System.out.println("empDTO.getEmpno() = "+empDTO.getEmpno());
		
		System.out.println("empService = "+empService);
		
		empService.test();
		
	}
	
	
}
