package sample04;

public class Student {

	private String name;
	private int no;
	private String phone;
	private String addr;
	
	public Student() {
		System.out.println("student 기본생성자 호출");
	}

	public void setName(String name) {
		System.out.println("setName(String name) call = "+name);
		this.name = name;
	}

	public void setNo(int no) {
		System.out.println("setNo(int no) call = "+no);
		this.no = no;
	}

	public void setPhone(String phone) {
		System.out.println("setPhone(String Phone) call = " +phone);
		this.phone = phone;
	}

	public void setAddr(String addr) {
		System.out.println("setAddr(String addr) call = "+addr);
		this.addr = addr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", no=");
		builder.append(no);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", addr=");
		builder.append(addr);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}
