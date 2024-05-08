package sample07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("boardService") // 생성 id="boardService"
public class BoardServiceImpl implements BoardService {


	public BoardServiceImpl() {
		System.out.println("BoardServiceImpl 기본 생성자");
	}
	
	@Autowired //생성
	private BoardDAO boardMyBatisDAOImpl;
	
	@Autowired //생성
	@Qualifier("boardOracleDAOImpl")
	private BoardDAO boardOracleDao;
	
	
	@Override
	public void select() {
		System.out.println("BoardServiceImpl의 selsect 호출");
		
		System.out.println("boardMyBatisDAOImpl = "+boardMyBatisDAOImpl);
		System.out.println("boardOracleDao = "+boardOracleDao);
		
		boardMyBatisDAOImpl.select();
		
		boardOracleDao.select();
	}

}
