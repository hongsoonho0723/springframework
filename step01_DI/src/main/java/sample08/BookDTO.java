package sample08;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Component
public class BookDTO {

	private String subject; 
	private String writer;
	private int price;
	private String date;
	
	
}
