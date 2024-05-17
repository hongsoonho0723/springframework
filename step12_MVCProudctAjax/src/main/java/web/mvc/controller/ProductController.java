package web.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import web.mvc.dto.ProductDTO;
import web.mvc.service.ProductService;

/**
 * ��ü�˻� : get��� http://localhost:9000/controller/products
 * �󼼺��� : get��� http://localhost:9000/controller/products/��ǰ�ڵ�
 * 
 * ��ϿϷ� : post��� http://localhost:9000/controller/products
 * 				=> param������ ��������� �־���Ѵ� (code, name, price, detail)
 * 
 * �����Ϸ� : put��� http://localhost:9000/controller/products/��ǰ�ڵ�
 * 				=> param������ ��������� �־���Ѵ� (name, price, detail)
 * 
 * 
 * �����Ϸ� : delete��� http://localhost:9000/controller/products/��ǰ�ڵ�
 * 
 * */

@RestController
@Slf4j
public class ProductController {

	@Autowired // byType����  -> byName-> �����̸��� ������ @Qualifier����
	private ProductService productService;
	
	
	
	
	/**
	 * ��ü�˻�
	 * : get��� http://localhost:9000/controller/products
	 * */
	@GetMapping("/products")
	public ResponseEntity<?> index() {//�μ��� Model�� �����ϸ� �������� ���޵� �����Ͱ� �ȴ�.
		List<ProductDTO> list = productService.select();
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
				
	}
	
	
	/**
	 * �󼼺���
	 * : get��� http://localhost:9000/controller/products/��ǰ�ڵ�
	 * */
	@GetMapping("/products/{code}")
	public ProductDTO read(@PathVariable String code) {
		log.info("�󼼺��� code = {}" , code);
		
		ProductDTO dto = productService.selectByCode(code);
		
		return dto;
	}
	/**
	 * �����ϱ�
	 * : put��� http://localhost:9000/controller/products/��ǰ�ڵ�
	 * => param������ ��������� �־���Ѵ� (name, price, detail)
	 * */
	@PutMapping("/products/{code}")
	public String update(@PathVariable String code,@RequestBody ProductDTO product) {
		product.setCode(code);
		log.info("product {}",product);
		productService.updateByCode(product);
		
		return "OK";
		
	}
	
	
	
	/**
	 * ��ǰ����ϱ�
	 * : post��� http://localhost:9000/controller/products
	 * */
	@PostMapping("/products")
	public ResponseEntity<?> insert(@RequestBody ProductDTO dto) { //json�� ���·� �μ� ���޵�
		
		productService.insert(dto);

		return ResponseEntity.status(HttpStatus.CREATED).body("OK");
	}
	
	/**
	 * �����ϱ�
	 * : delete��� http://localhost:9000/controller/products/��ǰ�ڵ�
	 * */
	@DeleteMapping("/products/{code}")
	public String delete(@PathVariable String code) {
		productService.delete(code);
		
		return "OK"; 
	}
	
	/**
	 * ���� ��
	 * 
	 * */
	@GetMapping("/updateForm/{code}")
	public ModelAndView update(@PathVariable String code) {
		
		ProductDTO product = productService.selectByCode(code);
		return new ModelAndView("updateForm", "product", product);
		
	}

	

}







