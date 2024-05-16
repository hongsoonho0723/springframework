package web.mvc.exception;

import lombok.Getter;  
import lombok.RequiredArgsConstructor;

/*
 * ���ΰ��õ�  ������� ���� �Ͽ� ���ϰ� ����ϱ� ���� �ڷ���
 * 	: �����ڵ�� ���ܸ޽����� �����ü�� �������� 
 * */
@RequiredArgsConstructor //final�ʵ带 ������� �����ڸ� �߰�
@Getter
public enum ErrorCode {
	
	/*
	 * ���̰� 18���� �̸��϶�... 
	 */

	INVALID_AGE(600,"�̼����ڴ� �ȵ˴ϴ�"),
	
	
	/*
	 * ���̵� �ߺ��϶� �߻��ϴ� ����
	 * 
	 * 
	 * */
	DUPLICATE_ID(601,"ID�� �ߺ��Դϴ�");
	
	private final int status;
	private final String msg;
	
	
}
/////////////////////////////////////
/*class ErrorCode{
	private int status;
	private String msg;
	
	static final ErrorCode INVALID_AGE=new ErrorCode(600,"�̼����ڴ� �ȵ˴ϴ�");
	static final ErrorCode DUPLICATE_ID=new ErrorCode(601,"ID�� �ߺ��Դϴ�");
	
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

















