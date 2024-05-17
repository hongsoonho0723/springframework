package web.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import web.mvc.dto.ProductDTO;
import web.mvc.service.ProductService;

@Controller
@Slf4j
public class ProductController {

	@Autowired // byType주입  -> byName-> 동일이름이 없으면 @Qualifier설정
	private ProductService productService;
	
	
	
	
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
	 * 각 화면(폼) 열기
	 * */
	@RequestMapping("/{url}")
	public void url() {
		log.info("url....");
	}
	
	/**
	 * 상세보기
	 * */
	@GetMapping("/read")
	//@RequestMapping("/read")
	public void read(String code, Model model) {
		log.info("상세보기 code = {}" , code);
		
		ProductDTO dto = productService.selectByCode(code);
		model.addAttribute("product", dto);//뷰에서 ${product.속성}
	}
	/**
	 * 수정하기
	 * */
	@PostMapping("/products/{code}")
	public String update(@PathVariable String code, ProductDTO product) {
		product.setCode(code);
		log.info("update ...");
		productService.updateByCode(product);
		
		//return "forward:/read";//기존req,res유지  -요청방식
		return "redirect:/read";
		
		//return "redirect:/read?code="+code;//get방식의 형태로 새로운,req,res
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
	
	/**
	 * 수정 폼
	 * */
	@GetMapping("/updateForm/{code}")
	public ModelAndView update(@PathVariable String code) {
		
		ProductDTO product = productService.selectByCode(code);
		return new ModelAndView("updateForm", "product", product);
		
	}

	

}







