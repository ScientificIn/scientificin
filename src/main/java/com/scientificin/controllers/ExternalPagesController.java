package com.scientificin.controllers;

import java.security.SecureRandom;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scientificin.beans.forms.FormCadastro;
import com.scientificin.entities.Sci;
import com.scientificin.entities.options.GrandeAreaDoConhecimento;
import com.scientificin.entities.options.Instituicao;
import com.scientificin.repositories.AreasDoConhecimentoRepository;
import com.scientificin.repositories.GrandesAreasDoConhecimentoRepository;
import com.scientificin.repositories.InstiuicoesRepository;
import com.scientificin.repositories.SciRepository;

@Controller
public class ExternalPagesController {
	
	@Autowired SciRepository sciRepo;
	@Autowired GrandesAreasDoConhecimentoRepository grandesAreasRepo;
	@Autowired AreasDoConhecimentoRepository areasRepo;
	@Autowired InstiuicoesRepository instRepo;
	
	@ModelAttribute(value="grandesAreas")
	public List<GrandeAreaDoConhecimento>  getGrandesAreas () {
		return grandesAreasRepo.findAll();
	}
	@ModelAttribute(value="instituicoes")
	public List<Instituicao>  getSubAreas () {
		return instRepo.findAll();
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout,
		Model model) {
	  if (error != null) {
		model.addAttribute("error", "Usuário ou senha inválidos.");
		return "index";
	  }

	  if (logout != null) {
		model.addAttribute("msg", "Você foi desconectado.");
		return "index";
	  }
	  
	  return "home";
	}
	
	@RequestMapping("/")
	public String index (Model model) {
		return "index";
	}
	
	@RequestMapping(value="/cadastro", method=RequestMethod.POST)
	public String cadastrar (Model model, FormCadastro form, HttpServletResponse resp) {
		if (form.validate()) {
			Instituicao instituicao = instRepo.findOne(form.getInstituicao());
			GrandeAreaDoConhecimento grandeAreaDoConhecimento = grandesAreasRepo.findOne(form.getAreaDeAtuacao());
			
			BCryptPasswordEncoder encrypter = new BCryptPasswordEncoder(5, new SecureRandom());
			
			sciRepo.save(new Sci(form.getNome(), form.getEmail(), encrypter.encode(form.getPassword()), instituicao, grandeAreaDoConhecimento));
			
			model.addAttribute("success", true);
			return "home";
		} else {
			model.addAttribute("error", true);
			return "index";
		}
	}
	
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
		Sci aluno = sciRepo.findOne(1L);
		return "perfil";
	}


	//	in progress!
	// @RequestMapping(value="/perfil", method=RequestMethod.GET)
	// public String alteracaoPerfil(Model model) {
	// 	// model.addAttribute("aluno", sciRepo.findOne(1L));
	// 	Sci aluno = sciRepo.findOne(1L);
	// 	return "perfil";
	// }

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping("/busca")
	public String busca (Model model, @ModelAttribute("busca") FormCadastro form) {
		return "Busca2";
	}
	
}
