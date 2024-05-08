package sample08;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookDTO {

	private String subject; 
	private String writer;
	private int price;
	private String date;
	
	
}
