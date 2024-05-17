package web.mvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice // Controller에서 발생하는 예외를 공통(Advice)으로 처리하는 클래스
public class GlobalExceptionAdvice {

	@ExceptionHandler(MyErrorException.class)
	public ModelAndView error(MyErrorException e) {
		
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errMessage",e.getErrorCode().getMsg());
		mv.addObject("errStatus",e.getErrorCode().getStatus());
		
		//mv.setViewName("error"); //WEB-INF/views/number 
		
		
		return mv;
		
	}
	
	
}
