package com.scientificin.controllers.in;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scientificin.entities.Sci;
import com.scientificin.entities.Trabalho;
import com.scientificin.repositories.TrabalhoRepository;

@Controller
@RequestMapping("/in/{projectId}/details")
public class ProjectDetailsController {
	
	@Autowired TrabalhoRepository trabRepo;

	@RequestMapping(method=RequestMethod.GET)
	public String mostraDetalhesTrabalho (@PathParam("projectId") Long projectId, Model model) {
		Trabalho trabalho = trabRepo.findWorkDetails(projectId);
		Sci loggedUser = (Sci) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		model.addAttribute("trabalho", trabalho);
		model.addAttribute("sci", loggedUser);
		
		return "detalhesTrabalho";
	}
}
