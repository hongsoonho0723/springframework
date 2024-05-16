package web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.mvc.dao.ProductDAO;
import web.mvc.dto.ProductDTO;
import web.mvc.exception.ErrorCode;
import web.mvc.exception.MyErrorException;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;

	@Override
	public List<ProductDTO> selectAll() {

		List<ProductDTO> list = dao.selectAll();

		return list;
	}

	@Override
	public int insert(ProductDTO product) {
		int price = product.getPrice();
		int result = 0;

		if (price <= 1000 || price >= 10000) {
			throw new MyErrorException(ErrorCode.INVALID_price);
		}

		result = dao.insert(product);

		return result;
	}

}
