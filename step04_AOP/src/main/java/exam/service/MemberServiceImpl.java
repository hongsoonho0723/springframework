package exam.service;

public class MemberServiceImpl implements MemberService {

	@Override
	public int select() {
		System.out.println("MemberServiceImpl select() 핵심기능입니다.");
		return 100;
	}

	@Override
	public String selectById(String id) {
		System.out.println("MemberServiceImpl selectById(String id) 핵심기능입니다.");
		if(id==null)throw new RuntimeException("id는 반드시 입력해주세요.^^");
		return "Hi";
	}

	@Override
	public void update(String id, String name) {
		System.out.println("MemberServiceImpl update(String id, String name) 핵심기능입니다.");

	}

}
