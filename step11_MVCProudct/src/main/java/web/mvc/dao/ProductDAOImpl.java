package web.mvc.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import web.mvc.dto.ProductDTO;
import web.mvc.exception.ErrorCode;
import web.mvc.exception.MyErrorException;

@Repository //생성 id="productDAOImpl"  -> 가능하려면 반드시 <context:component-scan base-package="" 포함
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired //주입 - > byType
	private List<ProductDTO> productList; //ProductDTO객체 5개를 bean으로 생성해서 주입(xml문서작성)

	
	@PostConstruct //객체가 생성된후(생성자후에) 해야할 일이 있을때 선언
	public void aa() {
		System.out.println("productList = " + productList);
	}
	
	@Override
	public List<ProductDTO> select() {
		return productList;
		
	}

	@Override
	public int insert(ProductDTO productDTO) throws MyErrorException {
		//상품코드가 중복인지 체크한다.
		if( this.selectByCode(productDTO.getCode()) != null) {
			//중복이다.
			throw new MyErrorException(ErrorCode.DUPLICATE_PRODUCT_CODE);
		}
		
		//추가
		return productList.add(productDTO) ? 1 : 0;
		
		//return 1;
	}

	@Override
	public int delete(String code) throws MyErrorException {
		ProductDTO dto = this.selectByCode(code);
		
		if(dto==null)throw new MyErrorException(ErrorCode.INVALID_PRODUCT_CODE);
		
		return productList.remove(dto) ? 1 : 0 ;
		
		//return 1;
	}

	@Override
	public ProductDTO selectByCode(String code) {
		for(ProductDTO dto : productList) {
			if(dto.getCode().equals(code)) {
				return dto; //찾았다!!
			}
		}
		
		return null; //못찾았다.
	}

	@Override
	public int updateByCode(ProductDTO productDTO) throws MyErrorException {
		// TODO Auto-generated method stub
		return 0;
	}

}




