package sample08;

import org.springframework.beans.factory.annotation.Autowired;

public class BookController {

	@Autowired
	private BookDTO book2;
	@Autowired
	private BookDTO book1;
	@Autowired
	private BookService bookService;
	
	public void invoker() {
		bookService.save(book1, book2);
		
		
	};
	
}
