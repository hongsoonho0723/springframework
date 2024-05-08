package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample03.BookController;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("sample04/springDI_setter.xml");
		
		
		  System.out.println("===================================="); StudentController
		  controller = context.getBean("controller",StudentController.class);
		  controller.insert();
		  
		  
		 
	}
}
