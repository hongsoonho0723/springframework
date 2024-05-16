package web.mvc.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import web.mvc.dto.ProductDTO;
import web.mvc.exception.ErrorCode;
import web.mvc.exception.MyErrorException;

@Repository //���� id="productDAOImpl"  -> �����Ϸ��� �ݵ�� <context:component-scan base-package="" ����
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired //���� - > byType
	private List<ProductDTO> productList; //ProductDTO��ü 5���� bean���� �����ؼ� ����(xml�����ۼ�)

	
	@PostConstruct //��ü�� ��������(�������Ŀ�) �ؾ��� ���� ������ ����
	public void aa() {
		System.out.println("productList = " + productList);
	}
	
	@Override
	public List<ProductDTO> select() {
		return productList;
		
	}

	@Override
	public int insert(ProductDTO productDTO) throws MyErrorException {
		//��ǰ�ڵ尡 �ߺ����� üũ�Ѵ�.
		if( this.selectByCode(productDTO.getCode()) != null) {
			//�ߺ��̴�.
			throw new MyErrorException(ErrorCode.DUPLICATE_PRODUCT_CODE);
		}
		
		//�߰�
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
				return dto; //ã�Ҵ�!!
			}
		}
		
		return null; //��ã�Ҵ�.
	}

	@Override
	public int updateByCode(ProductDTO productDTO) throws MyErrorException {
		// TODO Auto-generated method stub
		return 0;
	}

}




