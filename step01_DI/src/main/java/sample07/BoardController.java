package sample07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // 수정하지않으면 id="boardController" @Controller("원하는 id 수정가능")
public class BoardController {

//객체1 변수2	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private BoardDTO boardDTO;
	
	@Autowired
	private BoardDTO boardDTO2;

	public void test() {
		System.out.println("boardService = "+boardService);
		System.out.println("boardDTO = "+boardDTO);
		System.out.println("boardDTO2 = "+boardDTO2);
		
		boardService.select();
		
	};
	
	
}
