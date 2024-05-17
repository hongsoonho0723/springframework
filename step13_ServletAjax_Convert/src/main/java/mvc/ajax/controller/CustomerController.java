package mvc.ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import mvc.ajax.dto.CustomerDTO;
import mvc.ajax.service.CustomerService;
import mvc.ajax.service.CustomerServiceImpl;


public class CustomerController implements RestController {
   private CustomerService customerService = new CustomerServiceImpl();
   
   public void test(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("axios test입니다....");
		

		PrintWriter out = response.getWriter();
		 out.print("22222OK.");
		
		
	}
   
	/**
	 * 아디중복체크
	 * */
	public void idCheck(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		boolean result = customerService.idCheck(id);
		
		PrintWriter out = response.getWriter();
		
		if(result) out.print("중복입니다.");
		else out.print("사용가능합니다.");
	}
	
	
	
	/**
	 * 등록하기
	 * */
	public void insert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");
		
		CustomerDTO dto = new CustomerDTO(id, name, Integer.parseInt(age), tel, addr);
		int result = customerService.insert(dto);
		
		PrintWriter out = response.getWriter();
		out.print(result); // 0 , 1 
	}
	
	/**
	 * 전체검색
	 * */
	public void selectAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<CustomerDTO> list = customerService.selectAll();
		
		//list를 응답할수 없기때문에 list를 jsonArray변환해서 보낸다.
		  Gson gson = new Gson();
		  String jsonArry = gson.toJson(list);
		
		PrintWriter out = response.getWriter();
		out.print(jsonArry);
		 
	}
	
	/**
	 * 수정하기
	 * */
	public void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");
		
		CustomerDTO dto = new CustomerDTO(id, name, Integer.parseInt(age), tel, addr);
		int result = customerService.update(dto);
		PrintWriter out = response.getWriter();
		out.print(result);
	}
	
	/**
	 * 삭제하기 
	 * */
	public void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
         String id =   request.getParameter("id");
         
        int result =  customerService.delete(id);
        PrintWriter out = response.getWriter();
		out.print(result);
	}

}











