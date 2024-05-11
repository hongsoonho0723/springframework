package exam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exam.service.MemberService;
import exam.service.UserService;

public class MainApp {

	
	public static void main(String [] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springAOP.xml");
		
		
		MemberService service= context.getBean("target", MemberService.class);
		
		System.out.println("--메소드 호출해보자 --");
		service.memberInsert("희정");
		
		System.out.println("\n==================");
		
		service.memberUpdate();
		
		System.out.println("\n==================");
		
		int result = service.memberDelete(5);
		System.out.println("result = "+result);
		
		System.out.println("\n==================");
		
		String s = service.select("subject", "hi");
		System.out.println("s = " +s);
		
		System.out.println("\n==================");
		
		UserService user = context.getBean("user",UserService.class);
		user.memberInsert("졸립다");
		user.memberTest(5);
		
		
		
	}
	
}
