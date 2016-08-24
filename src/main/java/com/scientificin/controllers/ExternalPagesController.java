package com.scientificin.controllers;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
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
import com.scientificin.entities.Estagio;
import com.scientificin.entities.Sci;
import com.scientificin.entities.options.GrandeAreaDoConhecimento;
import com.scientificin.entities.options.Instituicao;
import com.scientificin.repositories.AreasDoConhecimentoRepository;
import com.scientificin.repositories.GrandesAreasDoConhecimentoRepository;
import com.scientificin.repositories.InstiuicoesRepository;
import com.scientificin.repositories.SciRepository;
import com.scientificin.repositories.AlunoRepository;
import com.scientificin.repositories.EstagiarioRepository;
import com.scientificin.repositories.EstagioRepository;
import com.scientificin.repositories.OrientadorRepository;
import com.scientificin.repositories.SociedadeRepository;

@Controller
public class ExternalPagesController {
	
	@Autowired SciRepository sciRepo;
	@Autowired GrandesAreasDoConhecimentoRepository grandesAreasRepo;
	@Autowired AreasDoConhecimentoRepository areasRepo;
	@Autowired InstiuicoesRepository instRepo;
	@Autowired EstagioRepository EstRep;
	@Autowired EstagiarioRepository EstagiarioRep;
	@Autowired SociedadeRepository SocioRep;	
	@Autowired OrientadorRepository OrientadorRep;
	@Autowired AlunoRepository AlunoRep;
	
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

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping("/busca")
	public String busca (Model model, @ModelAttribute("busca") FormCadastro form) {
		return "Busca2";
	}
	

	@RequestMapping(value="/match", method=RequestMethod.GET)
	public String match (Model model) {
		return "findmatch";
	}
	
	@RequestMapping(value = "/match", method=RequestMethod.POST)
	public String findResultado(HttpServletRequest request, Model model) {
		/*@RequestParam("id") String id*/		
		String[] arr = new String[5];
		arr[0] = request.getParameter("Estagio");
		arr[1] = request.getParameter("Estagiario");
		arr[2] = request.getParameter("Socio");
		arr[3] = request.getParameter("Orientador");
		arr[4] = request.getParameter("Aluno");		
		
		
		//mn � o input do checkbox...(obs:sei l� pq usei esse nome)
		for(int a = 0 ; a < 5 ; a++){
			if(arr[a] != null){				
				arr[a] = request.getParameter("mn"+a);
			}				
		}
		
		if(arr[0] != null)
			model.addAttribute("listEstagio",EstRep.findEstByArea(arr[0]));
		
		if(arr[1] != null)
			model.addAttribute("listEstagiario",EstagiarioRep.findEstagiarioByArea(arr[1]));
		
		if(arr[2] != null)
			model.addAttribute("listSocio",SocioRep.findSocioByArea(arr[2]));
		
		if(arr[3] != null)
			model.addAttribute("listOrientador",OrientadorRep.findOrByArea(arr[3]));
		
		if(arr[4] != null)
			model.addAttribute("listAluno",AlunoRep.findAlunoByArea(arr[4]));
		
		model.addAttribute("arr",arr);		
		return "findResult";
	}
	
}
