package web.mvc.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;
import web.mvc.dto.ErrorInfoDTO;

@RestControllerAdvice //@ControllerAdvice and @ResponseBody
@Slf4j
public class GlobalExceptionAdvice {
	
	@ExceptionHandler(MyErrorException.class)
	public ResponseEntity<?> error(MyErrorException e) {
		
		log.error("Error Message error {} " , e.getErrorCode().getMsg() );
		ErrorCode errorCode = e.getErrorCode();
		
		///Body String�ΰ�� �ѱ����ڵ� ����//////////////
		/*
		 * HttpHeaders resHeaders = new HttpHeaders(); resHeaders.add("Content-Type",
		 * "application/json;charset=UTF-8");
		 * 
		 * return new ResponseEntity<>(errorCode.getMsg(),
		 * resHeaders,errorCode.getStatus());
		 */
		
		////Body�� �������� �Ӽ��� ������ �ִ� ��ü Ÿ������///////////////
		
		
		ErrorInfoDTO errorInfoDTO = 
				ErrorInfoDTO.builder()
				.status(errorCode.getStatus())
				.msg(errorCode.getMsg())
				.build();
		
		return ResponseEntity.status(errorCode.getStatus()).body(errorInfoDTO);
	}
	

}
