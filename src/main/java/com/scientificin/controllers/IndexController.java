/**
 * 
 */
package com.scientificin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author giulio
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String index (Model model) {
		return "index";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String login (Model model) {
		/*
		 * Login e sua validações
		 */
		
		return "home";
	}
	
	@RequestMapping(path="/cadastro", method=RequestMethod.POST)
	public String cadastra (Model model) {
		/*
		 * Cadastro e suas validações
		 */
		return "index";
	}
}
