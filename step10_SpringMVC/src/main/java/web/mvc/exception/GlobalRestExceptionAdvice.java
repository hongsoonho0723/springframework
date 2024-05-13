package web.mvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice // @ControllerAdviced @ResponseBody
@Slf4j
public class GlobalRestExceptionAdvice {

	/*
	 * @ExceptionHandler(IllegalArgumentException.class) public String
	 * error(IllegalArgumentException e) { log.error("예외메시지 : {} " ,
	 * e.getMessage());
	 * 
	 * return e.getMessage();
	 * 
	 * }
	 */
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<?> error(IllegalArgumentException e) {
		log.error("예외메시지 : {} " , e.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		
	}
	
	
	
	
	
	
}






