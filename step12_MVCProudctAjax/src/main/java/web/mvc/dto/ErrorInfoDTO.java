package web.mvc.dto;

import lombok.Builder;
import lombok.Getter;

/**
 * 예외가 발생했을떄 응답 되어질 예외관련 속성 관리하는 객체
 */
@Getter
@Builder
public class ErrorInfoDTO {

	private int status;
	private String msg;
	
	
	
}
