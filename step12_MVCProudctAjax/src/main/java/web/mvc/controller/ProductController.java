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
 * 전체검색 : get방식 http://localhost:9000/controller/products
 * 상세보기 : get방식 http://localhost:9000/controller/products/상품코드
 * 
 * 등록완료 : post방식 http://localhost:9000/controller/products
 * 				=> param정보로 등록정보가 있어야한다 (code, name, price, detail)
 * 
 * 수정완료 : put방식 http://localhost:9000/controller/products/상품코드
 * 				=> param정보로 등록정보가 있어야한다 (name, price, detail)
 * 
 * 
 * 삭제완료 : delete방식 http://localhost:9000/controller/products/상품코드
 * 
 * */

@RestController
@Slf4j
public class ProductController {

	@Autowired // byType주입  -> byName-> 동일이름이 없으면 @Qualifier설정
	private ProductService productService;
	
	
	
	
	/**
	 * 전체검색
	 * : get방식 http://localhost:9000/controller/products
	 * */
	@GetMapping("/products")
	public ResponseEntity<?> index() {//인수로 Model을 선언하면 뷰쪽으로 전달될 데이터가 된다.
		List<ProductDTO> list = productService.select();
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
				
	}
	
	
	/**
	 * 상세보기
	 * : get방식 http://localhost:9000/controller/products/상품코드
	 * */
	@GetMapping("/products/{code}")
	public ProductDTO read(@PathVariable String code) {
		log.info("상세보기 code = {}" , code);
		
		ProductDTO dto = productService.selectByCode(code);
		
		return dto;
	}
	/**
	 * 수정하기
	 * : put방식 http://localhost:9000/controller/products/상품코드
	 * => param정보로 등록정보가 있어야한다 (name, price, detail)
	 * */
	@PutMapping("/products/{code}")
	public String update(@PathVariable String code,@RequestBody ProductDTO product) {
		product.setCode(code);
		log.info("product {}",product);
		productService.updateByCode(product);
		
		return "OK";
		
	}
	
	
	
	/**
	 * 상품등록하기
	 * : post방식 http://localhost:9000/controller/products
	 * */
	@PostMapping("/products")
	public ResponseEntity<?> insert(@RequestBody ProductDTO dto) { //json의 형태로 인수 전달됨
		
		productService.insert(dto);

		return ResponseEntity.status(HttpStatus.CREATED).body("OK");
	}
	
	/**
	 * 삭제하기
	 * : delete방식 http://localhost:9000/controller/products/상품코드
	 * */
	@DeleteMapping("/products/{code}")
	public String delete(@PathVariable String code) {
		productService.delete(code);
		
		return "OK"; 
	}
	
	/**
	 * 수정 폼
	 * 
	 * */
	@GetMapping("/updateForm/{code}")
	public ModelAndView update(@PathVariable String code) {
		
		ProductDTO product = productService.selectByCode(code);
		return new ModelAndView("updateForm", "product", product);
		
	}

	

}







