package sample06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		
		
		//controller의 empTest를 호출해서결과를 확인
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("sample06/springDI.xml");
		
		
		System.out.println("------------------------");
		
		EmpController con =
				context.getBean("controller",EmpController.class);
		con.empTest();
		
		
	}

}
