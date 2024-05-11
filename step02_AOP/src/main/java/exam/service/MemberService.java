package exam.service;

public interface MemberService {


	void memberInsert(String name);
	void memberUpdate();
	int memberDelete(int no);
	String select(String keyField,String keyWord);



}
