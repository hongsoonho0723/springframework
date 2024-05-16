package web.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import web.mvc.dto.ProductDTO;
import web.mvc.exception.MyErrorException;
import web.mvc.service.ProductService;

@Controller
public class ProductController {

	@Autowired // byType주입  -> byName-> 동일이름이 없으면 @Qualifier설정
	private ProductService productService;
	
	/**
	 * 각 화면(폼) 열기
	 * */
	@RequestMapping("/{url}")
	public void url() {}
	
	
	/**
	 * 전체검색
	 * */
	@RequestMapping("/")
	public String index(Model model) {//인수로 Model을 선언하면 뷰쪽으로 전달될 데이터가 된다.
		//service -> daol
		List<ProductDTO> list = productService.select();
		
		model.addAttribute("productList", list);//뷰에서 ${productList}
		return "productList"; //prefix +뷰이름 + suffix
	}
	
	/**
	 * 상세보기
	 * */
	@GetMapping("/read")
	public void read(String code, Model model) {
		ProductDTO dto = productService.selectByCode(code);
		model.addAttribute("product", dto);//뷰에서 ${product.속성}
	}
	
	
	/**
	 * 상품등록하기
	 * */
	@PostMapping("/products")
	public String insert(ProductDTO dto) { //폼으로 값 전송
		productService.insert(dto);
		
		return "redirect:/"; //controller -> controller
	}
	
	/**
	 * 삭제하기
	 * */
	@GetMapping("/del/{code}")
	public String delete(@PathVariable String code) {
		productService.delete(code);
		
		return "redirect:/"; 
	}
	
	
	

}







