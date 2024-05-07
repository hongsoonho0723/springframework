package sample01;

public class MessageBeanKoImpl implements MessageBean {
	public MessageBeanKoImpl() {
		System.out.println("MessageBeanKoImpl call");
	}
	public void sayHello(String name) {

		System.out.println(name + "님 방가방가~~");
	}

}
