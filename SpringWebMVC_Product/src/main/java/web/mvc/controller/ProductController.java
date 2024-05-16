package web.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import web.mvc.dto.ProductDTO;
import web.mvc.service.ProductService;

@Controller
@Slf4j

public class ProductController {

	@Autowired
	private ProductService service;

	
	
	
	
	  @RequestMapping("/") public ModelAndView selectAll() { //�μ��� Model�� �����ϸ� �������� ���޵� �����Ͱ� �ȴ� log.info("controller ��û");
	  
	  List<ProductDTO> list = service.selectAll(); ModelAndView mv = new
	  ModelAndView(); mv.addObject("productList", list);
	  mv.setViewName("productList");
	  
	  return mv; 
	  }
	 

	@RequestMapping("/{url}")
	public void url() {}
	
	/*
	 * @RequestMapping("/insertForm") public String insertForm() { return
	 * "insertForm"; }
	 */
	
	@PostMapping(value = "/insert")
	public String insert(@ModelAttribute("product") ProductDTO product) { 
		log.info("insert ��û!");					
		System.out.println("product = "+product);
		int result = service.insert(product);
		log.info("controller result = "+result);
		
		
		return "redirect:/";
	}
	
	

	
	
	
	
}
