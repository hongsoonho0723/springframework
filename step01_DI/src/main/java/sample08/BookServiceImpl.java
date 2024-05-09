package sample08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private EmailSender emailSender;
	
	@Autowired
	private MessageSender messageSender;

	@Autowired
	private BookDAO bookDao;
	
	@Override
	public void save(BookDTO book1,BookDTO book2) {

		bookDao.save(emailSender,messageSender,book1, book2);
	}

}
