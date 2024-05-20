package exam.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@ToString(exclude = {"team"})
public class Member {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "member_pk_seq") //generator 와 name 매칭
	@SequenceGenerator(name="member_pk_seq" , sequenceName = "member_pk_seq" , allocationSize = 1) //
	private Long memberId;
	
	private String name;
	
	private int age;
	
	//@ManyToOne //즉시로딩 // To를 기준으로 앞에는 member 뒤에는 참조 대상 // 일반속성으로 fk 설정
	//@ManyToOne(fetch = FetchType.EAGER) //즉시로딩
	@ManyToOne(fetch = FetchType.LAZY) //지연로딩
	@JoinColumn(name="tid")
	private Team team; // 객체지향적인 사고 
	
}
