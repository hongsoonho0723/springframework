package sample08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;
@Controller
@RequiredArgsConstructor // @NonNull or final 필드를 대상으로 생성자를 만들어 주입

public class BookController {

	//@Autowired
	private final BookService bookService;
	
	@Autowired
	private BookDTO book2;

	@Autowired
	private BookDTO book1;
	
	public void invoker() {
		bookService.save(book1, book2);
		
		
	};
	
}
