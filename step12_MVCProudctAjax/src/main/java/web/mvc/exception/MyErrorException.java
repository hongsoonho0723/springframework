package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 상품코드가 중복되거나 가격의 범위가 벗어났을때 발생하는 예외 클래스 
 * */

@Getter
@RequiredArgsConstructor
public class MyErrorException extends RuntimeException {
//public class MyErrorException extends Exception {//체크예외
	
   private final ErrorCode errorCode;
   
 /*  public MyErrorException(ErrorCode errorCode) {
	   this.errorCode = errorCode;
   }*/
	
 
   
}
//사용    throw new MyErrorException(ErrorCode.상수이름);


