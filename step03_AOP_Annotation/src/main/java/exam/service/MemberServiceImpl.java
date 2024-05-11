package exam.service;

import org.springframework.stereotype.Service;

@Service("target") //생성 <bean class="MemberServiceImpl" id="memberServiceImpl"/>
public class MemberServiceImpl implements MemberService {

	@Override
	public void memberInsert(String name) {

		System.out.println("MemberServiceImpl의 memberInsert(String name) 핵심기능입니다...");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void memberUpdate() {
		System.out.println("MemberServiceImpl의 memberUpdate() 핵심기능입니다...");
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public int memberDelete(int no) {
		System.out.println("MemberServiceImpl의 memberDelete(int no) 핵심기능입니다...");
		try {
			Thread.sleep(1500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		return 100;
	}

	@Override
	public String select(String keyField, String keyWord) {
		System.out.println("MemberServiceImpl의 select(String keyField, String keyWord) 핵심기능입니다...");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return "배고프다";
	}

}
