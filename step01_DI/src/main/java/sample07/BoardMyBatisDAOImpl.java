package sample07;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component //Component 가장 최상의요소 생성
@Repository // <bean class="" id="boardMyBatisDAOImpl"> 동일 : id는 클레스이름의 첫글자만 소문자로 자동생성
public class BoardMyBatisDAOImpl implements BoardDAO {

	
	public BoardMyBatisDAOImpl() {
		System.out.println("BoardMyBatisDAOImpl 기본 생성자 ");
	}
	
	@Override
	public void select() {
		System.out.println("BoardMyBatisDAOImpl의 select 호출!!");
		
	}

}
