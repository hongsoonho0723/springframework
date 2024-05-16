package web.mvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionAdvice {

	@ExceptionHandler(MyErrorException.class)
	public ModelAndView error(MyErrorException e) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("errMessage",e.getMessage());
		mv.addObject("errStatus",e.getErrorCode());
		
		mv.setViewName("error"); //WEB-INF/views/number 
		
		
		return mv;
		
	}
	
	
}
