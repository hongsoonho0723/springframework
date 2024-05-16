package web.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;
import web.mvc.dto.ProductDTO;
import web.mvc.exception.ErrorCode;
import web.mvc.exception.MyErrorException;

@Repository
@Slf4j
public class ProductDAOImpl implements ProductDAO {
	
	
	@Autowired
	private List<ProductDTO> productList;

	
	@PostConstruct
	public List<ProductDTO> init() {
				
		return productList;
	}
	
	
	
	@Override
	public List<ProductDTO> selectAll() {

		

		return productList;
	}


	@Override
	public int insert(ProductDTO product) {
		int check = codeCheck(product);
		int result =0;
		
		if(check==0) {
	
		productList.add(product);
		if(product !=null) {
			result = 1;
		}else {
			throw new MyErrorException(ErrorCode.INVALID_code);
		}
		
		
		}
		return result;
	}

	public int codeCheck(ProductDTO product) {
		int result = 0;
		
		String code = product.getCode();
		for(ProductDTO dto : productList) {
			if(dto.getCode().equals(code)) {
				result = 1;
			}
						
		}
		
		return result;
	}
	
	
	
}
