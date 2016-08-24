package com.scientificin.controllers.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scientificin.entities.Sci;
import com.scientificin.repositories.SciRepository;

@Controller
@RequestMapping("/in")
public class PerfilController {
	
	@Autowired
	private SciRepository sciRepo;

//	mock!
	@RequestMapping(value="/editarPerfil", method=RequestMethod.GET)
	public String editarPerfil(Model model) {
		model.addAttribute("aluno", sciRepo.findOne(1L));
		return "editarPerfil";
	}

	//	mock!
	@RequestMapping(value="/perfil", method=RequestMethod.GET)
	public String perfil(Model model) {
		model.addAttribute("aluno", sciRepo.findOne(1L));
		return "perfil";
	}
	
	
	//	mock!
	@RequestMapping(value="/editarPerfilAction", method=RequestMethod.POST)
	public String editarPerfilAlterarNome(Sci sci, @RequestParam("nome") String novoNome, Model model) {
		Sci aluno = (Sci) model.asMap().get("aluno");
		aluno.setNome(novoNome);
		sciRepo.save(aluno);
		return "editarPerfil";
	}


	//	in progress!
	// @RequestMapping(value="/perfil", method=RequestMethod.GET)
	// public String alteracaoPerfil(Model model) {
	// 	// model.addAttribute("aluno", sciRepo.findOne(1L));
	// 	Sci aluno = sciRepo.findOne(1L);
	// 	return "perfil";
	// }
}
