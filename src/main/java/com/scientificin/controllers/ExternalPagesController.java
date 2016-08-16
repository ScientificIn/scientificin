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

import com.scientificin.beans.forms.FormCadastro;
import com.scientificin.entities.GrandeAreaDoConhecimento;
import com.scientificin.entities.Instituicao;
import com.scientificin.entities.Sci;
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

	@RequestMapping({"/login", "/", "/cadastro"})
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
	
	@RequestMapping(value="/perfil", method=RequestMethod.GET)
	public String perfil(Model model) {
		model.addAttribute("aluno", sciRepo.findOne(2L));
		return "perfil";
	}

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login() {
		return "home";
	}
	
	@RequestMapping("/busca")
	public String busca (Model model, @ModelAttribute("busca") FormCadastro form) {
		return "Busca2";
	}
	
}
