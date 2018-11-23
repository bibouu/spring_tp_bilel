package com.cesi.ril17.tpSpring.prog.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesi.ril17.tpSpring.prog.Entities.Product;
import com.cesi.ril17.tpSpring.prog.Entities.Seller;
import com.cesi.ril17.tpSpring.prog.Repositories.ProductRepository;
import com.cesi.ril17.tpSpring.prog.Repositories.SellerRepository;

@Service
public class ProductService {
	
private ProductRepository productRepo;
	
	@Autowired
	public ProductService(ProductRepository productRepo){
		super();
		this.productRepo=productRepo;
	}
	public List<Product> findAllProduct(){
		
		List<Product> products = (List<Product>) productRepo.findAll();
		return (products.isEmpty()) ? null : products;
		
	}

}
