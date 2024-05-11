package web.mvc.controller;

/**
 * ���� ��û�� � Controller�� �����ؾ��ϴ����� ã���ִ� Ŭ���� 
 * */
public class HandlerMapping {
	private static HandlerMapping factory = new HandlerMapping(); //�̱��� ���� 
	
	private HandlerMapping() {}
	
	public static HandlerMapping getFactory() { //�ܺο��� get�޼ҵ带 �̿��ؼ��� ����Ҽ��ְ� ����
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
