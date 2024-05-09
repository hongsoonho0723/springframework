package exam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exam.service.MemberService;

public class MainApp {

	
	public static void main(String [] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springAOP.xml");
		
		MemberService service = context.getBean("target" , MemberService.class);
		
		System.out.println("********************************************");
		int re = service.select();
		System.out.println("re = "+ re);
		
		System.out.println("********************************************");
		String s = service.selectById("jang");
		System.out.println("결과 = "+s);
		
		System.out.println("********************************************");
		service.update("kim","김희선");
		
	}
	
}
