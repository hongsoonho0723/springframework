package web.mvc.service;

import java.util.List;

import web.mvc.dto.ProductDTO;

public interface ProductService {

	List<ProductDTO> selectAll();

	int insert(ProductDTO product);

	ProductDTO selectByCode(String code);

	int delete(String code);
	
}
