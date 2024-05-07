package sample03;

public class BookDAOImpl implements BookDAO {

	
	public BookDAOImpl() {
		System.out.println("BookDAOImpl 생성자");
		
	}
	public void insert(BookVo bookVo) {
		System.out.println("BookDAOImpl insert 호출!");
		System.out.println("bookVo = "+bookVo);
	}

}
