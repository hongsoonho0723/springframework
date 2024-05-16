package web.mvc.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProductDTO {

	private String code;  
	private String name; 
	private int price; 
	private String detail;
	
	
}
