package web.mvc.controller;

/**
 * 현재 요청이 어떤 Controller를 실행해야하는지를 찾아주는 클래스 
 * */
public class HandlerMapping {
	private static HandlerMapping factory = new HandlerMapping(); //싱글톤 패턴 
	
	private HandlerMapping() {}
	
	public static HandlerMapping getFactory() { //외부에서 get메소드를 이용해서만 사용할수있게 만듬
		return factory;
	}

	public Controller getController(String key){
		Controller controller =null;
		
		if(key.equals("insert")) {
			controller = new InsertController();
		}else if(key.equals("select")){
			controller=new SelectController();
		}else if(key.equals("update")) {
			controller= new UpdateController();
		}else if(key.equals("delete")) {
			controller = new DeleteController();
		}
		
		
		return controller;
	}
}
