package sample01;

public class MessageBeanEnImpl implements MessageBean {
	public MessageBeanEnImpl() {
		System.out.println("MessageBeanEnImpl call");
	}
	public void sayHello(String name) {
		
		System.out.println("Hello ~ "+name);
		
	}

}
