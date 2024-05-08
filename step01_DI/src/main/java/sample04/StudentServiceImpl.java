package sample04;

public class StudentServiceImpl implements StudentService {

	private StudentDAO studentDAO;
	
	public StudentServiceImpl() {
		System.out.println("StudentServiceImpl의 기본생성자입니다 ");
	}
	
	public void setStudentDAO(StudentDAO studentDAO) {
		System.out.println("setStudentDAO(StudentDAO studentDAO) = "+studentDAO);
		this.studentDAO = studentDAO;
	}

	@Override
	public void insert(Student student) {
		System.out.println("StudentServiceImpl의 insert입니다");
		System.out.println("student = " +student);
		
	}

}
