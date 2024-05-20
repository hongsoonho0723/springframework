package exam.domain;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Builder
//@Entity	//JPA가 관리해야할 객체
@DynamicUpdate // 변경하려고 하는 컬럼만 변경가능
@DynamicInsert // insert into Customer values(  )를 사용할때 등록을 할려고하는 컬럼만 등록할수있다
public class Customer {

	@Id	//pk
	//@GeneratedValue(strategy = GenerationType.AUTO) //시퀀스 생성
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="customer_id_seq") // generator == @SequenceGenerator에 name과 매칭 
	@SequenceGenerator(name="customer_id_seq",sequenceName = "customer_id_seq", allocationSize = 1) // sequenceName == create sequnce 시퀀스이름 allocationSize 시퀀스 증가값
	private Long id;

	@Column(nullable = false ,length = 100 , name = "user_name",unique=true)
	private String userName; //기본은 null 허용
	
	//@Transient //생성될떄 컬럼을 만들지 않는다
	private int age; // 기본은 not null
	
	//등록일
	@CreationTimestamp	//등록일은 새로운 레코드가 추가될때 날짜가 자동
	private LocalDateTime insertDate;
	
	
	//수정일
	@UpdateTimestamp //추가 , 수정될 날짜가 자동 변경된다
	private LocalDateTime updateDate;
	
	//생일
	@Temporal(TemporalType.DATE)
	private Date birthDay;
	
	
	
}
