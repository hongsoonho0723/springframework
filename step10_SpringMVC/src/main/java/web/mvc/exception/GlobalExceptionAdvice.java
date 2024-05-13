package web.mvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/*
 * 모든 컨트롤러에서 발생하는 예외를 전역으로 처리하는 객체
 * */

@ControllerAdvice
public class GlobalExceptionAdvice {

	@ExceptionHandler(NumberFormatException.class)
	public ModelAndView error(NumberFormatException e) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("errMsg",e.getMessage());
		mv.addObject("errClass",e.getClass().getName());
		
		mv.setViewName("error/numberError"); //WEB-INF/views/number 
		
		
		return mv;
		
	}
	
	
	/*
	 * 인증예외일때
	 * */
	
	/*
	 * DML관련예외 일때
	 * */
	
	/*
	 * 인  
	 */
	 
	
	
}
