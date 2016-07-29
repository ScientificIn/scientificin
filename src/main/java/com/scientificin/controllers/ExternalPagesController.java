package com.scientificin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scientificin.beans.forms.FormCadastro;
import com.scientificin.entities.Sci;
import com.scientificin.repositories.SciRepository;

@Controller
public class ExternalPagesController {
	
	@Autowired SciRepository sciRepo;

	@RequestMapping({"/login", "/", "cadastro"})
	public String index (Model model) {
		return "index";
	}
	
	@RequestMapping(value="/cadastro", method=RequestMethod.POST)
	public String cadastrar (Model model, @ModelAttribute("cadastro") FormCadastro form) {
		if (form.validate()) {
			sciRepo.save(new Sci(form.getEmail(), form.getPassword()));
			
			model.addAttribute("success", true);
			return "home";
		} else {
			model.addAttribute("error", true);
			return "index";
		}
	}
}
