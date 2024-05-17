package web.mvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice // Controller���� �߻��ϴ� ���ܸ� ����(Advice)���� ó���ϴ� Ŭ����
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
