package rbs.cb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import rbs.cb.pojo.ProductPojo;
import rbs.cb.service.ProductService;







@Controller
public class WelcomeController {

	
	
	@Autowired
	private ProductService productservice;

	@GetMapping("/")
	String loginpage() {

		return "loginpage";
	}

	
	

	
	@GetMapping("/welcome_page")
	String welcomePage() {

		return "welcome_page";
	}
	
	
	
	
	@PostMapping(value = "/register_product")
	public String registerCompany(@ModelAttribute("productpojo") ProductPojo c) {



		productservice.save(c);

		return "redirect:list_product";
	}
	
	

	
	@GetMapping("/show_new_product_form")
	String show_new_product_form(ModelMap model) {
		model.addAttribute("productpojo", new ProductPojo());
		return "show_new_product_form";
	}


	@GetMapping(value = "/list_product")
	public String listproduct(ModelMap model) {

		List<ProductPojo> productpojolist = productservice.list();
		model.addAttribute("productpojolist", productpojolist);
		model.addAttribute("productpojo", new ProductPojo());
		return "product_list";
	}
	
	
	@GetMapping(value = "/edit_prodlist")
	public String editprod(@RequestParam int product_id, ModelMap model) {

		System.out.println("Value passed com id ..." + product_id);
		ProductPojo productpojo = productservice.get(product_id);
		model.addAttribute("productpojo", productpojo);

		return "edit_product";
	}

	@PostMapping(value = "/edit_product_details")
	public String editProduct( @ModelAttribute("productpojo") ProductPojo c) {

		productservice.update(c);

		return "redirect:list_product";
	}
	
	
	
	
	@GetMapping(value = "/delete_products")
	public String delproduct(@RequestParam int product_id) {
		
		productservice.deleteProduct(product_id);

		return "redirect:list_product";
	}
	
	
	@PostMapping(value = "/searchbyproductname")
	public String searchbyname(@ModelAttribute("productpojo") ProductPojo c, ModelMap model) {


		List<ProductPojo> productpojolist = productservice.list1(c.getProduct_name().trim());

		model.addAttribute("productpojolist", productpojolist);

		return "product_list";
	}






	
	
}

