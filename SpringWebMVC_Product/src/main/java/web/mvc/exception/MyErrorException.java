package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor //final�ʵ������� ������ ����
@Getter
public class MyErrorException extends RuntimeException{
	private final ErrorCode errorCode ;
	
}


