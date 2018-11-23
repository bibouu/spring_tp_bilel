package com.cesi.ril17.tpSpring.prog.Services;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesi.ril17.tpSpring.prog.Entities.Product;
import com.cesi.ril17.tpSpring.prog.Entities.Seller;
import com.cesi.ril17.tpSpring.prog.Repositories.ProductRepository;
import com.cesi.ril17.tpSpring.prog.Repositories.SellerRepository;

@Service
public class DataLoader {
	
	private SellerRepository sellerRepo;
	private ProductRepository productRepo;

	@Autowired
	public DataLoader(SellerRepository sellerRepo,ProductRepository productRepo) {
		super();
		this.sellerRepo = sellerRepo;
		this.productRepo = productRepo;
	}
	
	@PostConstruct
	private void loadData(){
		//create seller
		//Client client1 = new Client(null,"Bilel","Boudouft","",null);
		Seller seller1 = new Seller(null,"Rakuten","Paris 16e Arrondissement","95000","Paris", null);
		sellerRepo.save(seller1);
		
		Product product1 = new Product(null,"iPhone XR","Smartphone APPLE",839.59,null,null);
		productRepo.save(product1);
		
	}
}
