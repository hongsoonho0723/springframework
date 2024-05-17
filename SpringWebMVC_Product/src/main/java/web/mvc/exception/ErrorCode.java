package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //final필드를 기반으로 생성자를 추가
@Getter
public enum ErrorCode {

	INVALID_PRODUCT_CODE(600, "상품코드가 잘못되었습니다."),
	  
	  /*
	   * 코드가 중복일때
	   * */
	DUPLICATE_PRODUCT_CODE(601, "상품코드 중복입니다."),
	
	INVALID_price(602,"가격이 1000~10000원 범위를 벗어났습니다"),
	FAILD_UPDATE(603,"수정되지 않았습니다");
	
	private final int status;
	private final String msg;
	
}



