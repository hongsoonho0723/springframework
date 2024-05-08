package sample07;

import org.springframework.stereotype.Repository;

@Repository //<bean class="" id="boardOracleDAOImpl"> , @Repository("boardOracleDao") 이름을 변경해줄수있다
public class BoardOracleDAOImpl implements BoardDAO {

	public BoardOracleDAOImpl() {
		System.out.println("BoardOracleDAOImpl 기본 생성자");
	}
	
	
	@Override
	public void select() {
		System.out.println("BoardOracleDAOImpl의 select 호출!!!");
		
	}

}
