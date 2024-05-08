package sample08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample07.BoardController;

public class MainApp {

	public static void main(String[] args) {

			
			ApplicationContext context =
					new ClassPathXmlApplicationContext("sample08/springDI.xml");
					
			
			System.out.println("-------------------------------------------------");
			
			BookController con =context.getBean("bookController",BookController.class);
			con.invoker();
			
		
		
	}

}
