package web.mvc.dto;

import lombok.Builder;
import lombok.Getter;

/**
 * ���ܰ� �߻������� ���� �Ǿ��� ���ܰ��� �Ӽ� �����ϴ� ��ü
 */
@Getter
@Builder
public class ErrorInfoDTO {

	private int status;
	private String msg;
	
	
	
}
