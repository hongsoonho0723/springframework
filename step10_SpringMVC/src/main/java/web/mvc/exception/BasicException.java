package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor //final�ʵ������� ������ ����
@Getter
public class BasicException extends RuntimeException {

	private final ErrorCode errorCode ;
	
	
	
}



