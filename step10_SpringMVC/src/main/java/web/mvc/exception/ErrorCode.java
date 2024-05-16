package web.mvc.exception;

import lombok.Getter;  
import lombok.RequiredArgsConstructor;

/*
 * 서로관련된  상수들을 정의 하여 편리하게 사용하기 위한 자료형
 * 	: 예외코드와 예외메시지를 상수객체로 관리하자 
 * */
@RequiredArgsConstructor //final필드를 기반으로 생성자를 추가
@Getter
public enum ErrorCode {
	
	/*
	 * 나이가 18보다 미만일때... 
	 */

	INVALID_AGE(600,"미성년자는 안됩니다"),
	
	
	/*
	 * 아이디 중복일때 발생하는 예외
	 * 
	 * 
	 * */
	DUPLICATE_ID(601,"ID는 중복입니다");
	
	private final int status;
	private final String msg;
	
	
}
/////////////////////////////////////
/*class ErrorCode{
	private int status;
	private String msg;
	
	static final ErrorCode INVALID_AGE=new ErrorCode(600,"미성년자는 안됩니다");
	static final ErrorCode DUPLICATE_ID=new ErrorCode(601,"ID는 중복입니다");
	
	ErrorCode(int status, String msg){
		this.status = status;
		this.msg = msg;
	}
}

class Test{
	public void aa() {
		ErrorCode e1 = ErrorCode.INVALID_AGE;
		ErrorCode e2 = ErrorCode.DUPLICATE_ID;
		
	}
	
	
}



*/

















