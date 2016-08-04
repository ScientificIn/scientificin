package com.scientificin.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping({"/login", "/", "cadastro"})
	public String index (Model model) {
		return "index";
	}
	
	@RequestMapping(value="/cadastro", method=RequestMethod.POST)
	public String cadastrar (Model model, @ModelAttribute("cadastro") FormCadastro form, HttpServletResponse resp) {
		if (form.validate()) {
			sciRepo.save(new Sci(form.getEmail(), form.getPassword()));
			
			model.addAttribute("success", true);
			return "home";
		} else {
			model.addAttribute("error", true);
			return "index";
		}
	}
	//@RequestMapping(value="/busca", method=RequestMethod.POST)
	@RequestMapping("/busca")
	public String busca (Model model, @ModelAttribute("busca") FormCadastro form) {
		return "Busca2";
	}
	
}
