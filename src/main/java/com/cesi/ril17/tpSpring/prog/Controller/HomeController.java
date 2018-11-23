package com.cesi.ril17.tpSpring.prog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	

	@GetMapping("/")
	public String index(Model model){
		//model.addAttribute("msg","Hello c'est le modèle qui m'envoie");
		return "views/index";
	}

}
