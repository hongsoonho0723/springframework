package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //final�ʵ带 ������� �����ڸ� �߰�
@Getter
public enum ErrorCode {

	/*
	 * �ڵ尡 �ߺ��϶�
	 * */
	INVALID_code(600,"�ڵ尡 �ߺ��Դϴ�"),
	
	INVALID_price(601,"������ 1000~10000�� ������ ������ϴ�");
	
	private final int status;
	private final String msg;
	
}



