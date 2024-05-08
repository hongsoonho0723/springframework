package sample08;

public class BookController {

	private BookDTO book2;
	private BookDTO book1;
	private BookService bookService;
	
	public void invoker() {
		bookService.save(book1, book2);
		
		
	};
	
}
