package exam.domain;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
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
@Entity	//JPA가 관리해야할 객체
@DynamicUpdate // 변경할것만 변경됨
public class Customer {

	@Id	//pk
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false ,length = 100 , name = "user_name",unique=true)
	private String userName;
	
	//@Transient //생성될떄 컬럼을 만들지 않는다
	private int age;
	
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
