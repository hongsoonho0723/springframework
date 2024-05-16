package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
/**
 * Enum(������)�� ���� ���õ� ������� �����Ͽ� ���ϰ� ����ϱ� ���� �ڷ����̴�. 
 * 
 * */
public enum ErrorCode { //enum�� 'Enumeration' �� ���ڷ� ����, ��� �̶�� ��
 
  INVALID_PRODUCT_CODE(600, "��ǰ�ڵ尡 �߸��Ǿ����ϴ�."),
  
  DUPLICATE_PRODUCT_CODE(601, "��ǰ�ڵ� �ߺ��Դϴ�."),
 
  INVALID_PRICE(602, "������ 1000~ 10000�� ���̸� �����մϴ�.");
	
  
 
  private final int status;
  private final String msg;
}

///////enum�� ������...////////////////////////////////
/*
class ErrorCode{
	    public static final ErrorCode INVALID_PRODUCT_CODE = new ErrorCode(600, "��ǰ�ڵ尡 �߸��Ǿ����ϴ�.");
	    public static final ErrorCode DUPLICATE_PRODUCT_CODE = new ErrorCode(601, "��ǰ�ڵ� �ߺ��Դϴ�.");
	    public static final ErrorCode INVALID_PRICE = new ErrorCode(602, "�������� �ʴ� ȸ���Դϴ�.");
	    
	    ErrorCode(int status, String msg){
	    	this.status =status;
	    	this.msg=msg
	    }
}*/

