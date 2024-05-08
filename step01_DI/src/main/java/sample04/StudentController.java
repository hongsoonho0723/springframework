package sample04;

public class StudentController {

	private StudentService studentService;
	private Student student;
	
	public StudentController() {
		System.out.println("StudentController의 기본생성자입니다");
	}

	public void setStudentService(StudentService studentService) {
		System.out.println("setStudentService(StudentService studentService) 호출");
		System.out.println("studentService = "+studentService);
		this.studentService = studentService;
	}

	public void setStudent(Student student) {
		System.out.println("setStudent(Student student) 호출");
		System.out.println("student = "+student);
		this.student = student;
	}

	
	public void insert() {
		System.out.println("studentcontroller insert호출");
		studentService.insert(student);
		
	}
	
	
	
	
	
	
}
