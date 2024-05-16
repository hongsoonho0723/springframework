package web.mvc.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import web.mvc.dto.ProductDTO;

@Service
@Slf4j
public class GoodsService {

	@Autowired //byType����
	private List<ProductDTO> productList;
	
	
	public GoodsService() {
		System.out.println("GoodsService ������");
	}
	
	
	@PostConstruct
	public void init() {
		log.info("productList = "+productList);
		
		
	}
	
	
	
	public void test() {
		System.out.println("GoodsSerivce test() ȣ���...");
		
	}
	
	
	
}
