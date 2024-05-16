package web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.mvc.dao.ProductDAO;
import web.mvc.dto.ProductDTO;
import web.mvc.exception.ErrorCode;
import web.mvc.exception.MyErrorException;

@Service //생성 id="productServiceImpl"
public class ProductServiceImpl implements ProductService {

	@Autowired //type을 찾아서 주입
	private ProductDAO productDAO;
	
	private final static int MIN_PRICE=1000;
	private final static int MAX_PRICE=10000;
	
	@Override
	public List<ProductDTO> select() {
		return productDAO.select();
	}

	@Override
	public int insert(ProductDTO productDTO) throws MyErrorException {
		//가격의 범위를 체크
		if(productDTO.getPrice() < MIN_PRICE || productDTO.getPrice() > MAX_PRICE) {
			throw new MyErrorException(ErrorCode.INVALID_PRICE);
		}
		
		int result = productDAO.insert(productDTO);
		
		return result;
	}

	@Override
	public int delete(String code) throws MyErrorException {
		int result = productDAO.delete(code);
		return result;
	}

	@Override
	public ProductDTO selectByCode(String code)throws MyErrorException {
		ProductDTO product = productDAO.selectByCode(code);
		if(product==null)
			throw new MyErrorException(ErrorCode.INVALID_PRODUCT_CODE);
		
		return product;
	}

}












