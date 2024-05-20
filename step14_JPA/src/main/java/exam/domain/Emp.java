package exam.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Entity //jpa관리할 객체
public class Emp {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO) //시퀀스 생성
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="emp_id_seq") // generator == @SequenceGenerator에 name과 매칭 
	@SequenceGenerator(name="emp_id_seq",sequenceName = "emp_id_seq", allocationSize = 1) // sequenceName == create sequnce 시퀀스이름 allocationSize 시퀀스 증가값
	
	private Long empno;
	
	private String ename;
	private String job;
	
	
	
}
