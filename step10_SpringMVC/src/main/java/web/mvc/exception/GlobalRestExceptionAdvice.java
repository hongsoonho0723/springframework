package web.mvc.exception;

import org.springframework.http.HttpHeaders; 
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
	
	/*
	 * @ExceptionHandler(IllegalArgumentException.class) public ResponseEntity<?>
	 * error(IllegalArgumentException e) { log.error("예외메시지 : {} " ,
	 * e.getMessage());
	 * 
	 * return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
	 * //HttpStatus.NOT_FOUND는 404에러
	 * 
	 * }
	 */
	
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<?> error(IllegalArgumentException e) {
		log.error("예외메시지 : {} " , e.getMessage());
		
		HttpHeaders resHeaders = new HttpHeaders();
		resHeaders.add("Content-Type","application/json;charset=UTF-8");
		return new ResponseEntity<>(e.getMessage(), resHeaders,HttpStatus.NOT_FOUND); //HttpStatus.NOT_FOUND는 404에러
			
		
	}
	
	//////////////////////////////////////////////////////////////
	@ExceptionHandler(BasicException.class)
	public ResponseEntity<?> error(BasicException e){
		log.error("예외메시지 : {} " , e.getErrorCode().getMsg());
		
		ErrorCode errorCode = e.getErrorCode();
		
		ResponseBodyDTO dto = new ResponseBodyDTO();
		dto.setMessage(errorCode.getMsg());
		dto.setStatus(errorCode.getStatus());
		
		
		return ResponseEntity.status(errorCode.getStatus()).body(dto);
		
		
	}
	
}





























