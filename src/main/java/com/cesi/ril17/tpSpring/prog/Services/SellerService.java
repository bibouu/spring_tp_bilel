package com.cesi.ril17.tpSpring.prog.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesi.ril17.tpSpring.prog.Entities.Seller;
import com.cesi.ril17.tpSpring.prog.Repositories.SellerRepository;

@Service
public class SellerService {
	
	private SellerRepository sellerRepo;
	
	@Autowired
	public SellerService(SellerRepository sellerRepo){
		super();
		this.sellerRepo=sellerRepo;
	}
	public List<Seller> findAllSeller(){
		
		List<Seller> sellers = (List<Seller>) sellerRepo.findAll();
		return (sellers.isEmpty()) ? null : sellers;
		
	}
	

}
