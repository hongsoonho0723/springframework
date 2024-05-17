package web.mvc.dao;

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
		ProductDTO check = codeCheck(product);
		
		if(check!=null) {
			throw new MyErrorException(ErrorCode.INVALID_PRODUCT_CODE);
	
		}	
		
		return productList.add(product) ? 1 : 0;
	}

	public ProductDTO codeCheck(ProductDTO product) {
		String code = product.getCode();
		for(ProductDTO dto : productList) {
			if(dto.getCode().equals(code)) {

				return dto;
			}
						
		}
		
		return null;
	}


	@Override
	public ProductDTO selectByCode(String code) {

		for(ProductDTO dto : productList) {
			if(dto.getCode().equals(code)) {
				return dto;
			}
			
		}
		
		return null;
	}



	@Override
	public int delete(String code) {
		ProductDTO productDTO = selectByCode(code);
		
		return productList.remove(productDTO) ? 1 : 0;
		
		
	}



	@Override
	public int update(ProductDTO productDTO) {

		 ProductDTO saveDTO = this.selectByCode(productDTO.getCode());
		 
		 if(saveDTO==null)throw new MyErrorException(ErrorCode.FAILD_UPDATE);
		 
		 //¼öÁ¤
		 saveDTO.setName(productDTO.getName());
		 saveDTO.setPrice(productDTO.getPrice());
		 saveDTO.setDetail(productDTO.getDetail());
		return 1;
	}
	
	
	
}
