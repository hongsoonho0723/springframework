package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		/*
		 * //기존 방식 Member member = new Member("jang","1234",20,"서울");
		 * 
		 * MemberDAO dao = new MemberDAO();
		 * 
		 * MemberService service= new MemberService(dao,member);
		 */
		
		////////////////////////////////////////////////////
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("sample02/springDI_Constructor.xml");
		
		System.out.println("====================================");
		MemberService service = context.getBean("service",MemberService.class);
		service.serviceInsert();
		
	}

}
