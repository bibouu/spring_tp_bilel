package com.cesi.ril17.tpSpring.prog.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cesi.ril17.tpSpring.prog.Entities.Seller;
import com.cesi.ril17.tpSpring.prog.Repositories.SellerRepository;

@RestController
@RequestMapping("/allSellerRest")
public class SellerControllerRest {
	
	@Autowired
	private SellerRepository sellerRepo;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Seller> get() {
		
		return (List<Seller>) sellerRepo.findAll();
	}
	

}
