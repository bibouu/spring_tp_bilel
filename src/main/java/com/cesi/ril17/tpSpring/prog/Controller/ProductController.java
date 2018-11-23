package com.cesi.ril17.tpSpring.prog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cesi.ril17.tpSpring.prog.Entities.Product;
import com.cesi.ril17.tpSpring.prog.Entities.Seller;
import com.cesi.ril17.tpSpring.prog.Services.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
@GetMapping("/allProduct")
	
	public String allProduct(Model model){
        List<Product> list = productService.findAllProduct();

		model.addAttribute("list_all_product",list);
		return "views/allProduct";
	}
		@GetMapping("/addProduct")
		public String addProduct(Model model){
			model.addAttribute("product", new Product());
			return "views/addProduct";

}
}
