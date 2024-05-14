package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor //final필드기반으로 생성자 생성
@Getter
public class BasicException extends RuntimeException {

	private final ErrorCode errorCode ;
	
	
	
}



