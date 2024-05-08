package sample06;

import org.springframework.beans.factory.annotation.Value;

public class EmpDTO {
	@Value("10")
	private int empno;
	
	@Value("희정")
	private String ename;
	
	@Value("teacher")
	private String job;
	
	public EmpDTO() {
		System.out.println("EmpDTO 기본생성자 호출됨!!!");
	}

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}
	
	
	
	
	
}
