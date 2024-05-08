package sample04;

public class StudentDAOImpl implements StudentDAO {

	
	public StudentDAOImpl(){
		System.out.println("StudentDAOImpl 생성자 호출");
	}
	
	@Override
	public void insert(Student student) {
		System.out.println("studentDAOImpl의 insert입니다");
		System.out.println("student = " + student);
	}

}
