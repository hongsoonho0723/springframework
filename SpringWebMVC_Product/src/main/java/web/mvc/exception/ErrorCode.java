package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //final�ʵ带 ������� �����ڸ� �߰�
@Getter
public enum ErrorCode {

	  INVALID_PRODUCT_CODE(600, "��ǰ�ڵ尡 �߸��Ǿ����ϴ�."),
	  
	  /*
	   * �ڵ尡 �ߺ��϶�
	   * */
	  DUPLICATE_PRODUCT_CODE(601, "��ǰ�ڵ� �ߺ��Դϴ�."),
	
	INVALID_price(601,"������ 1000~10000�� ������ ������ϴ�");
	
	private final int status;
	private final String msg;
	
}



