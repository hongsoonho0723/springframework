package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		/*
		 * 기존방식 MessageBean bean = new MessageBeanKoImpl(); bean.sayHello("순호");
		 * 
		 * bean = new MessageBeanEnImpl(); bean.sayHello("soonho");
		 */
		
		
		
		///////////////////////////////////
		//Spring Container인 ApplicationContext를 이용해서 객체를 관리
		// 스프링bean설정문서 필요 - configration meta-data필요 ~ .xml
		

		//ApplicationContext는 객체를 사전초기화 : scope="singleton" 사전초기화
		//같은 id를 여러번 getBean을 해도 모두 동일한 객체이다
		//만약 필요할떄마다 새로운 객체를 생성해서 사용하고 싶다 scope="prototype"변경 지연초기화
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("sample01/applicationContext.xml"); 
		
		System.out.println("---------------------------------------");
		MessageBean bean = context.getBean("ko",MessageBean.class);
		
		bean.sayHello("순호");
		 
		MessageBean bean2 = context.getBean("en",MessageBean.class);
		bean2.sayHello("soonho");
		
		MessageBean bean3 = context.getBean("en",MessageBean.class);
				
		
		System.out.println("bean = "+ bean);
		System.out.println("bean2 = "+ bean2);
		System.out.println("bean3 = "+ bean3);
	}

}
