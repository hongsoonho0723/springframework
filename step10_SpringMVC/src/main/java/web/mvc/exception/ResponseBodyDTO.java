package web.mvc.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseBodyDTO {

	//Body로 전달될 정보들을 속성으로 관리
	
	 private String message;
	 private int status;

	 //
	
	
	
}
