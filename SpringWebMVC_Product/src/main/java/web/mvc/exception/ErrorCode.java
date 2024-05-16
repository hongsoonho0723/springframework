package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //final필드를 기반으로 생성자를 추가
@Getter
public enum ErrorCode {

	/*
	 * 코드가 중복일때
	 * */
	INVALID_code(600,"코드가 중복입니다"),
	
	INVALID_price(601,"가격이 1000~10000원 범위를 벗어났습니다");
	
	private final int status;
	private final String msg;
	
}



