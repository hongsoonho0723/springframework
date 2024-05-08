package sample03;

public class BookController {

	private BookDAO bookDao;
	private BookVo bookVo;
	
	
	public BookController() {
		System.out.println("BookController 생성자");
		
	}
	
	
	public BookController(BookDAO bookDao,BookVo bookVo) {
		System.out.println("BookController BookController(BookDAO bookDAO,BookVo bookVo)");
		System.out.println("bookDao = "+bookDao);
		System.out.println("bookVo = "+bookVo);
		this.bookDao=bookDao;
		this.bookVo=bookVo;
		
	}
	
	public void bookInsert() {
		System.out.println("BookController bookInsert 호출");
		System.out.println("bookDao = "+bookDao);
		System.out.println("bookVo = "+bookVo);
		bookDao.insert(bookVo);
	}

	
	
}
