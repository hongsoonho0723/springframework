package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * ��ǰ�ڵ尡 �ߺ��ǰų� ������ ������ ������� �߻��ϴ� ���� Ŭ���� 
 * */

@Getter
@RequiredArgsConstructor
public class MyErrorException extends RuntimeException {
//public class MyErrorException extends Exception {//üũ����
	
   private final ErrorCode errorCode;
   
 /*  public MyErrorException(ErrorCode errorCode) {
	   this.errorCode = errorCode;
   }*/
	
 
   
}
//���    throw new MyErrorException(ErrorCode.����̸�);


