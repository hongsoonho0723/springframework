package exam.service;

public class UserService {

	public int memberInsert(String name) {
		System.out.println("UserService의 memberInsert(String name) 호출됨");
		
		try {
			Thread.sleep(300);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		return 5;
		
	}
	public void memberTest(int name) {
		System.out.println("UserService의 memberTest(int name) 호출됨");
		
		try {
			Thread.sleep(700);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
