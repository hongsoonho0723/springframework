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

	@Autowired // byType����  -> byName-> �����̸��� ������ @Qualifier����
	private ProductService productService;
	
	
	
	
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
	 * �� ȭ��(��) ����
	 * */
	@RequestMapping("/{url}")
	public void url() {
		log.info("url....");
	}
	
	/**
	 * �󼼺���
	 * */
	@GetMapping("/read")
	//@RequestMapping("/read")
	public void read(String code, Model model) {
		log.info("�󼼺��� code = {}" , code);
		
		ProductDTO dto = productService.selectByCode(code);
		model.addAttribute("product", dto);//�信�� ${product.�Ӽ�}
	}
	/**
	 * �����ϱ�
	 * */
	@PostMapping("/products/{code}")
	public String update(@PathVariable String code, ProductDTO product) {
		product.setCode(code);
		log.info("update ...");
		productService.updateByCode(product);
		
		//return "forward:/read";//����req,res����  -��û���
		return "redirect:/read";
		
		//return "redirect:/read?code="+code;//get����� ���·� ���ο�,req,res
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
	
	/**
	 * ���� ��
	 * */
	@GetMapping("/updateForm/{code}")
	public ModelAndView update(@PathVariable String code) {
		
		ProductDTO product = productService.selectByCode(code);
		return new ModelAndView("updateForm", "product", product);
		
	}

	

}







