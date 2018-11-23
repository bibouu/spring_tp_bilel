package com.cesi.ril17.tpSpring.prog.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cesi.ril17.tpSpring.prog.Entities.Seller;
import com.cesi.ril17.tpSpring.prog.Services.SellerService;

@Controller
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@GetMapping("/allSeller")
	
	public String allSeller(Model model){
        List<Seller> list = sellerService.findAllSeller();

		model.addAttribute("list_all_seller",list);
		return "views/allSeller";
	}

}
