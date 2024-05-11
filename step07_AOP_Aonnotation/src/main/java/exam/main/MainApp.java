package exam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exam.service.Player;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("springAOP.xml");
		
		
		Player p = context.getBean("tv", Player.class);
		p.start(10);
		p.pause();
		p.stop();
		
		System.out.println("-----------------------");
		p = context.getBean("audio", Player.class);
		p.start(20);
		p.pause();
		p.stop();
		
		System.out.println("-----------------------");
		p = context.getBean("video", Player.class);
		p.start(30);
		p.pause();
		p.stop();
		
		
	}

}
