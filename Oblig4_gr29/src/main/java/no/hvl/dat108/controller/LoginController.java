package no.hvl.dat108.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import no.hvl.dat108.model.Deltaker;



@Controller
public class LoginController {

	
	@Value("${app.url.login}")
	private String LOGIN_URL;
	
//	@Autowired
//	private deltakerRepo deltakerRepo;

	
	
	/**
	 * This is a HTTP get method. It will display the login view.
	 * 
	 * @return A login view.
	 */
	
	@GetMapping(value="/")
	public String getLogin(@ModelAttribute("deltaker") Deltaker deltaker, Model model) {
		model.addAttribute("deltaker", new Deltaker());
		return "paamelding";
	}

	@PostMapping(value="/paamelding")
	public String getdeltakerForms(@Valid @ModelAttribute("deltaker") Deltaker deltaker,BindingResult bs) {
		if(bs.hasErrors()) {
			System.out.println("feil");
			return "paamelding";
		}
		
		return "paameldt";
	}
}
