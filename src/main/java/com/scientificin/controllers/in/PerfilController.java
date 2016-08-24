package com.scientificin.controllers.in;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scientificin.entities.Sci;
import com.scientificin.entities.options.GrandeAreaDoConhecimento;
import com.scientificin.entities.options.Instituicao;
import com.scientificin.repositories.GrandesAreasDoConhecimentoRepository;
import com.scientificin.repositories.InstiuicoesRepository;
import com.scientificin.repositories.SciRepository;

@Controller
@RequestMapping("/in")
public class PerfilController {
	
	@Autowired
	private SciRepository sciRepo;
	@Autowired GrandesAreasDoConhecimentoRepository grandesAreasRepo;
	@Autowired InstiuicoesRepository instRepo;
	
	@ModelAttribute(value="grandesAreas")
	public List<GrandeAreaDoConhecimento>  getGrandesAreas () {
		return grandesAreasRepo.findAll();
	}
	@ModelAttribute(value="instituicoes")
	public List<Instituicao>  getSubAreas () {
		return instRepo.findAll();
	}

//	mock!
	@RequestMapping(value="/editarPerfil", method=RequestMethod.GET)
	public String editarPerfil(Model model, ServletRequest req) {
		HttpSession session = ((HttpServletRequest) req).getSession();
		Sci sci = (Sci) session.getAttribute("sci");
		
		model.addAttribute("aluno", sciRepo.findOne(sci.getUsername()));
		return "editarPerfil";
	}

	//	mock!
	@RequestMapping(value="/perfil", method=RequestMethod.GET)
	public String perfil(Model model, ServletRequest req) {
		return "perfil";
	}
	
	
	//	mock!
	@RequestMapping(value="/editarPerfilAction", method=RequestMethod.POST)
	public String editarPerfilAlterarNome(Sci sci, Model model) {
		Sci aluno = (Sci) model.asMap().get("aluno");
//		sciRepo.save(aluno);
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
