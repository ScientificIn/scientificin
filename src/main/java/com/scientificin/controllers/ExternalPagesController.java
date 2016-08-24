package com.scientificin.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scientificin.beans.forms.FormCadastro;
import com.scientificin.entities.Sci;
import com.scientificin.entities.options.GrandeAreaDoConhecimento;
import com.scientificin.entities.options.Instituicao;
import com.scientificin.repositories.AreasDoConhecimentoRepository;
import com.scientificin.repositories.ConferenciasRepository;
import com.scientificin.repositories.GrandesAreasDoConhecimentoRepository;
import com.scientificin.repositories.InstiuicoesRepository;
import com.scientificin.repositories.SciRepository;
import com.scientificin.repositories.TrabalhoRepository;

@Controller
public class ExternalPagesController {
	
	@Autowired SciRepository sciRepo;
	@Autowired GrandesAreasDoConhecimentoRepository grandesAreasRepo;
	@Autowired AreasDoConhecimentoRepository areasRepo;
	@Autowired InstiuicoesRepository instRepo;
	@Autowired ConferenciasRepository confRepo;
	@Autowired TrabalhoRepository trabRepo;
	
	@ModelAttribute(value="grandesAreas")
	public List<GrandeAreaDoConhecimento>  getGrandesAreas () {
		return grandesAreasRepo.findAll();
	}
	@ModelAttribute(value="instituicoes")
	public List<Instituicao>  getSubAreas () {
		return instRepo.findAll();
	}
	
	@RequestMapping("/")
	public String index (Model model) {
		return "index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login (HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession(true);
		
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		
		Sci sci = sciRepo.findByUsername(user);
		
		if (sci != null) {
			sci.setConferencias(confRepo.findBySci(sci));
			sci.setTrabalhos(trabRepo.findByAutor(sci));
			
			if (BCrypt.checkpw(pass, sci.getPassword())) {
				session.setAttribute("sci", sci);
			} else {
				return "index";
			}
		} else {
			return "index";
		}
			
		return "home";
	}
	
	@RequestMapping(value="/cadastro", method=RequestMethod.POST)
	public String cadastrar (Model model, FormCadastro form, HttpServletRequest req) {
		if (form.validate()) {
			HttpSession session = req.getSession(true);
			
			Instituicao instituicao = instRepo.findOne(form.getInstituicao());
			GrandeAreaDoConhecimento grandeAreaDoConhecimento = grandesAreasRepo.findOne(form.getAreaDeAtuacao());
			
			Sci sci = sciRepo.save(new Sci(form.getNome(), form.getEmail(), 
					BCrypt.hashpw(form.getPassword(), BCrypt.gensalt()), instituicao, grandeAreaDoConhecimento));

			session.setAttribute("sci", sci);
			
			model.addAttribute("success", true);
			return "home";
		} else {
			model.addAttribute("error", true);
			return "index";
		}
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.POST)
	public void logout (HttpServletRequest req, HttpServletResponse resp) throws IOException {
		HttpSession session = req.getSession(true);
		
		session.removeAttribute("sci");
		resp.sendRedirect("/");
	}

	@RequestMapping("/busca")
	public String busca (Model model, @ModelAttribute("busca") FormCadastro form) {
		return "Busca2";
	}
	

}
