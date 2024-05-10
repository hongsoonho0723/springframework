package web.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//등록하기
		System.out.println("InsertController 입니다. ");
		
		return new ModelAndView("index.jsp", true);//rediect방식으로 이동해라.
	}

}
