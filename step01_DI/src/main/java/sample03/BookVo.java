package sample03;

public class BookVo {

	private String subject;
	private String writer;
	private int price;
	private String date;
	
	
	public BookVo() {
		
	}


	public BookVo(String subject, String writer, int price, String date) {
		super();
		this.subject = subject;
		this.writer = writer;
		this.price = price;
		this.date = date;
		System.out.println(subject+" "+writer+" "+price+" "+date);
	}


	public String getSubject() {
		return subject;
	}


	public String getWriter() {
		return writer;
	}


	public int getPrice() {
		return price;
	}


	public String getDate() {
		return date;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookVo [subject=");
		builder.append(subject);
		builder.append(", writer=");
		builder.append(writer);
		builder.append(", price=");
		builder.append(price);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
