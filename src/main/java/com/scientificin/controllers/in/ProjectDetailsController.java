package com.scientificin.controllers.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scientificin.entities.Trabalho;
import com.scientificin.repositories.AvaliacoesRepository;
import com.scientificin.repositories.BibliografiasRepository;
import com.scientificin.repositories.RecursosRepository;
import com.scientificin.repositories.TrabalhoRepository;

@Controller
@RequestMapping("/in")
public class ProjectDetailsController {
	
	@Autowired TrabalhoRepository trabRepo;
	@Autowired AvaliacoesRepository avalRepo;
	@Autowired BibliografiasRepository biblioRepo;
	@Autowired RecursosRepository recRepo;

	@RequestMapping(value="/trabalho/{projectId}", method=RequestMethod.GET)
	public String mostraDetalhesTrabalho (@PathVariable("projectId") Long projectId, Model model) {
		Trabalho trabalho = trabRepo.findOne(projectId);
		trabalho.setAvaliacoes(avalRepo.findByTrabalho(trabalho));
		trabalho.setBibliografias(biblioRepo.findByTrabalho(trabalho));
		trabalho.setRecursos(recRepo.findByTrabalho(trabalho));
		
		model.addAttribute("trabalho", trabalho);
		
		return "in/detalhesTrabalho";
	}
	
}
