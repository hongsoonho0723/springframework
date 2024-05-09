package exam.main;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springAOP.xml");

		MemberService service = context.getBean("target" , MemberService.class);
		
	}

}
