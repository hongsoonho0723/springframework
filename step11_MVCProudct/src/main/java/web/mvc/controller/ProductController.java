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

	@Autowired // byType����  -> byName-> �����̸��� ������ @Qualifier����
	private ProductService productService;
	
	/**
	 * �� ȭ��(��) ����
	 * */
	@RequestMapping("/{url}")
	public void url() {}
	
	
	/**
	 * ��ü�˻�
	 * */
	@RequestMapping("/")
	public String index(Model model) {//�μ��� Model�� �����ϸ� �������� ���޵� �����Ͱ� �ȴ�.
		//service -> daol
		List<ProductDTO> list = productService.select();
		
		model.addAttribute("productList", list);//�信�� ${productList}
		return "productList"; //prefix +���̸� + suffix
	}
	
	/**
	 * �󼼺���
	 * */
	@GetMapping("/read")
	public void read(String code, Model model) {
		ProductDTO dto = productService.selectByCode(code);
		model.addAttribute("product", dto);//�信�� ${product.�Ӽ�}
	}
	
	
	/**
	 * ��ǰ����ϱ�
	 * */
	@PostMapping("/products")
	public String insert(ProductDTO dto) { //������ �� ����
		productService.insert(dto);
		
		return "redirect:/"; //controller -> controller
	}
	
	/**
	 * �����ϱ�
	 * */
	@GetMapping("/del/{code}")
	public String delete(@PathVariable String code) {
		productService.delete(code);
		
		return "redirect:/"; 
	}
	
	
	

}







