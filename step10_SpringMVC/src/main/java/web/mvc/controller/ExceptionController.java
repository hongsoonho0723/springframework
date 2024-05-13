package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;


@Controller //생성
@Slf4j //lombok에서 제공하는 Logger를 생성해주는 역할
public class ExceptionController {

	/*
	 * SLF4J(Simple Logging Facade For java) 여러 로깅프레임워크의 추상화를 제공해주는 라이브러리
	 * 	자바에서 쓰이는 다양한 로깅을 위한 프레임워크 API제공한다
	 * */
	
	/*
	 * private static final Logger log =
	 * LoggerFactory.getLogger(ExceptionController.class);
	 */
	
	
	
	
	@RequestMapping("/exception.do")
	public String aa(String no) {
		//System.out.println("ExceptionController no = "+no);
		log.info("ExceptionController no = "+ no);
		
		int convertNo = Integer.parseInt(no);
		System.out.println("convertNo = "+convertNo);
		
		int result = 100/ convertNo;
		//System.out.println("나눈결과 = "+result);
		log.info("ExceptionController no = "+ no);
		
		
		
		return "result";
	}
	
	
	
	/*
	 * 현재 컨트롤러에서 발생하는 예외처리
	 * */
	
	@ExceptionHandler(value = {NumberFormatException.class,ArithmeticException.class}) //모든 예외를 받으려면 Exception을 쓰면 모든 예외를 처리해준다
	public ModelAndView error(Exception e) {//모든 예외를 받으려면 Exception을 쓰면 모든 예외를 처리해준다
		log.error(e.getMessage()+"발생~~했어요.");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("errMsg",e.getMessage());
		mv.addObject("errClass",e.getClass().getName());
		
		mv.setViewName("error"); //WEB-INF/views/error.jsp이동 --> ${errMsg}
		return mv;
	}
	
	/*
	 * @ExceptionHandler(ArithmeticException.class) public ModelAndView
	 * error1(NumberFormatException e) { ModelAndView mv = new ModelAndView();
	 * mv.addObject("errMsg",e.getMessage());
	 * mv.addObject("errClass",e.getClass().getName());
	 * 
	 * mv.setViewName("error"); //WEB-INF/views/error.jsp이동 --> ${errMsg} return mv;
	 * }
	 */
}













