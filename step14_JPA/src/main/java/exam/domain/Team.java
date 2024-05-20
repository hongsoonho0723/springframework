package exam.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

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
@ToString
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "team_pk_seq") //generator 와 name 매칭
	@SequenceGenerator(name="team_pk_seq" , sequenceName = "team_pk_seq" , allocationSize = 1) //
	private Long id;
	
	@Column(nullable = false , length = 100)
	private String teamName;
	
	@OneToMany(mappedBy = "team")// @formatter:off
	//지연로딩
	private List<Member> memberList;
	
}
