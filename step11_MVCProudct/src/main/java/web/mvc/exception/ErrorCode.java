package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
/**
 * Enum(열거형)은 서로 관련된 상수들을 정의하여 편리하게 사용하기 위한 자료형이다. 
 * 
 * */
public enum ErrorCode { //enum은 'Enumeration' 의 약자로 열거, 목록 이라는 뜻
 
  INVALID_PRODUCT_CODE(600, "상품코드가 잘못되었습니다."),
  
  DUPLICATE_PRODUCT_CODE(601, "상품코드 중복입니다."),
 
  INVALID_PRICE(602, "가격은 1000~ 10000원 사이만 가능합니다.");
	
  
 
  private final int status;
  private final String msg;
}

///////enum이 없으면...////////////////////////////////
/*
class ErrorCode{
	    public static final ErrorCode INVALID_PRODUCT_CODE = new ErrorCode(600, "상품코드가 잘못되었습니다.");
	    public static final ErrorCode DUPLICATE_PRODUCT_CODE = new ErrorCode(601, "상품코드 중복입니다.");
	    public static final ErrorCode INVALID_PRICE = new ErrorCode(602, "존재하지 않는 회원입니다.");
	    
	    ErrorCode(int status, String msg){
	    	this.status =status;
	    	this.msg=msg
	    }
}*/

