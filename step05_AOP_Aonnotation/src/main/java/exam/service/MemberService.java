package exam.service;

public interface MemberService {
	int select();
	String selectById(String id);
	void update(String id, String name);
}
