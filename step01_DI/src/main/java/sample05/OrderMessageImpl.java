package sample05;

public class OrderMessageImpl implements OrderMessage {

	private int orderId;
	private String message; 
	private UserBean userBean;
	private ProductBean proudctBean;
	
	public OrderMessageImpl() {
		System.out.println("OrderMessageImpl 생성자");
	}
	


	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public ProductBean getProudctBean() {
		return proudctBean;
	}

	public void setProudctBean(ProductBean proudctBean) {
		this.proudctBean = proudctBean;
	}

	
	@Override
	public void getOrderMessage() {
		System.out.println("orderId : "+orderId);
		System.out.println("name : " + userBean.getName());
		System.out.println("phone : "+userBean.getPhone());
		System.out.println("상품명 : "+proudctBean.getPname());
		System.out.println("상품가격 : "+proudctBean.getPrice());
		System.out.println("메시지 : "+message);
	
	}
	
	
	
}
