package sample03;

public class BookDAOImpl implements BookDAO {

	
	public BookDAOImpl() {
		
	}
	
	@Override
	public void insert(BookVO bookVO) {
		System.out.println("BookDAOImpl insert 호출!");
	}

}
