package web.mvc.dao;

import java.util.List;

import web.mvc.dto.ProductDTO;

public interface ProductDAO {

	List<ProductDTO> selectAll();

	int insert(ProductDTO product);

	ProductDTO selectByCode(String code);

	int delete(String code);
	
	
}
