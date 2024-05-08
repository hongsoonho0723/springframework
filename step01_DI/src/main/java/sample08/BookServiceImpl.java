package sample08;

public class BookServiceImpl implements BookService {

	private EmailSender emailSender;
	private MessageSender messageSender;
	private BookDAO bookDao;
	
	@Override
	public void save(BookDTO book1,BookDTO book2) {

		bookDao.save(emailSender,messageSender,book1, book2);
	}

}
