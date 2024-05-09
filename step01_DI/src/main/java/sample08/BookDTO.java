package sample08;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Scope("prototype")
public class BookDTO {

	private String subject; 
	private String writer;
	private int price;
	private String date;
	
	
}
