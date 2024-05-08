package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample04.StudentController;

public class MainApp {

	public static void main(String[] args) {

		

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("sample05/applicationcontext.xml");
		
		
		  System.out.println("====================================");
		  OrderMessageImpl order= context.getBean("orderMessageImpl",OrderMessageImpl.class);
		  order.getOrderMessage();
		  
		  
	}

}
