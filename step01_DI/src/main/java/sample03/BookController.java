package sample03;

public class BookController {

	private BookDAO bookDAO;
	private BookVo bookVo;
	
	
	public BookController() {
		System.out.println("BookController 생성자");
		
	}
	
	
	public BookController(BookDAO bookDAO,BookVo bookVo) {
		System.out.println("BookController BookController(BookDAO bookDAO,BookVo bookVo)");
		System.out.println("bookDAO = "+bookDAO);
		System.out.println("bookVo = "+bookVo);
		this.bookDAO=bookDAO;
		this.bookVo=bookVo;
		
	}
	
	public void bookInsert() {
		System.out.println("BookController bookInsert 호출");
		System.out.println("bookDAO = "+bookDAO);
		System.out.println("bookVo = "+bookVo);
		bookDAO.insert(bookVo);
	}

	
	
}
