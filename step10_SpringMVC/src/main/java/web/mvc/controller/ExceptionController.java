package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;


@Controller //����
@Slf4j //lombok���� �����ϴ� Logger�� �������ִ� ����
public class ExceptionController {

	/*
	 * SLF4J(Simple Logging Facade For java) ���� �α������ӿ�ũ�� �߻�ȭ�� �������ִ� ���̺귯��
	 * 	�ڹٿ��� ���̴� �پ��� �α��� ���� �����ӿ�ũ API�����Ѵ�
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
		//System.out.println("������� = "+result);
		log.info("ExceptionController no = "+ no);
		
		
		
		return "result";
	}
	
	
	
	/*
	 * ���� ��Ʈ�ѷ����� �߻��ϴ� ����ó��
	 * */
	
	@ExceptionHandler(value = {NumberFormatException.class,ArithmeticException.class}) //��� ���ܸ� �������� Exception�� ���� ��� ���ܸ� ó�����ش�
	public ModelAndView error(Exception e) {//��� ���ܸ� �������� Exception�� ���� ��� ���ܸ� ó�����ش�
		log.error(e.getMessage()+"�߻�~~�߾��.");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("errMsg",e.getMessage());
		mv.addObject("errClass",e.getClass().getName());
		
		mv.setViewName("error"); //WEB-INF/views/error.jsp�̵� --> ${errMsg}
		return mv;
	}
	
	/*
	 * @ExceptionHandler(ArithmeticException.class) public ModelAndView
	 * error1(NumberFormatException e) { ModelAndView mv = new ModelAndView();
	 * mv.addObject("errMsg",e.getMessage());
	 * mv.addObject("errClass",e.getClass().getName());
	 * 
	 * mv.setViewName("error"); //WEB-INF/views/error.jsp�̵� --> ${errMsg} return mv;
	 * }
	 */
}













