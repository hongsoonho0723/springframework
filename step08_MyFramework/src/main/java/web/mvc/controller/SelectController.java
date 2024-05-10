package web.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SelectController 실행 입니다.....");
		
		request.setAttribute("message", "select의 결과 입니다.");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("selectResult.jsp");
		
		return mv;
	}

}
