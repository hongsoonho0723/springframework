package sample02;

public class Member {

	private String id;
	private String pwd;
	private int age;
	private String addr;
	
	public Member() {
		System.out.println("Member() 기본생성자");
	}
	
	public Member(String id) {
		this.id=id;
		System.out.println("Member(String id) 생성자 id = "+id);
	}

	public Member(String id,String pwd) {
		this.id=id;
		this.pwd=pwd;
		System.out.println("Member(String id,String pwd) 생성자");
		
	}
	

	public Member(String id,int age) {
		this.id=id;
		this.age=age;
		System.out.println("Member(String id,int age) 생성자");
	}
	

	public Member(String id,int age,String addr) {
		this.id=id;
		this.age=age;
		this.addr=addr;
		System.out.println("Member(String id,int age,String addr) 생성자");
	}
	

	public Member(String id,String pwd, int age , String addr) {
		this.id=id;
		this.pwd=pwd;
		this.age=age;
		this.addr=addr;
		System.out.println("Member(String id,String pwd, int age , String addr) 생성자 "+" "+id+" "+pwd+" "+age+" "+addr);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [id=");
		builder.append(id);
		builder.append(", pwd=");
		builder.append(pwd);
		builder.append(", age=");
		builder.append(age);
		builder.append(", addr=");
		builder.append(addr);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
}






