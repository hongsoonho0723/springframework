package sample01;

public class MessageBeanEnImpl implements MessageBean {
	public MessageBeanEnImpl() {
		System.out.println("MessageBeanEnImpl call");
	}
	@Override
	public void sayHello(String name) {
		
		System.out.println("Hello ~ "+name);
		
	}

}
