package sample07;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString // @ToString(exclude={"subject"}) subject 제외하기 ,를 사용해서 여러개
@NoArgsConstructor
@AllArgsConstructor
@Component // id="boardDTO"
@Scope("prototype") //필요할때마다 객체 생성

public class BoardDTO {
	
	@Value("100")
	private int no;

	@Value("spring연습")
	private String subject;
	
	@Value("신기")
	private String content;
	
	
	
	
	
}
