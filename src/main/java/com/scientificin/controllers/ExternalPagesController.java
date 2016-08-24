package com.scientificin.controllers;

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
import com.scientificin.repositories.AlunoRepository;
import com.scientificin.repositories.AreasDoConhecimentoRepository;
import com.scientificin.repositories.ConferenciasRepository;
import com.scientificin.repositories.EstagiarioRepository;
import com.scientificin.repositories.EstagioRepository;
import com.scientificin.repositories.GrandesAreasDoConhecimentoRepository;
import com.scientificin.repositories.InstiuicoesRepository;
import com.scientificin.repositories.OrientadorRepository;
import com.scientificin.repositories.SciRepository;
import com.scientificin.repositories.SociedadeRepository;
import com.scientificin.repositories.TrabalhoRepository;

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
	public String cadastrar (Model model, FormCadastro form, HttpServletResponse resp) {
		if (form.validate()) {
			Instituicao instituicao = instRepo.findOne(form.getInstituicao());
			GrandeAreaDoConhecimento grandeAreaDoConhecimento = grandesAreasRepo.findOne(form.getAreaDeAtuacao());
			
			sciRepo.save(new Sci(form.getNome(), form.getEmail(), 
					BCrypt.hashpw(form.getPassword(), BCrypt.gensalt()), instituicao, grandeAreaDoConhecimento));
			
			model.addAttribute("success", true);
			return "home";
		} else {
			model.addAttribute("error", true);
			return "index";
		}
	}

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
			if(arr[a] != null)				
				arr[a] = request.getParameter("mn"+a);
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
		
/*		List<Estagio> listEstagio = EstRep.findEstByArea(arr[0]);
		List<Estagio> listEstagiario = EstRep.findEstByArea(arr[1]);
		List<Estagio> listSocio = EstRep.findEstByArea(arr[2]);		
		List<Orientador> listOrientador = OrientadorRep.findOrByArea(arr[3]);
		List<Estagio> listAluno = EstRep.findEstByArea(arr[4]);*/
		
//		
//		Estagio testeEst = new Estagio();
//		testeEst.id = (long) 1;
//		testeEst.EMPRESA = "itau";
//		testeEst.DESC = "INFERNO PROFISSIONAL";
//		testeEst.area = "Telemetria";
//		
//		Orientador testeOri = new Orientador();
//		testeOri.id = (long) 1;
//		testeOri.ORIENTADOR = "Vera";
//		testeOri.DESC = "Orienta��o em Tecnologias para desenvolvimento WEB";
//		testeOri.AREA = "Ci�ncia da Computa��o";
		
		//Teste de lista de estagiarios	
//		List<Estagio> listEstagio = new ArrayList<Estagio>();
//		listEstagio.add(testeEst);
		
		//Teste de lista de Orientadores
//		List<Orientador> listOrientador = new ArrayList<Orientador>();
//		listOrientador.add(testeOri);
		
/*		model.addAttribute("listEstagio",listEstagio);
		model.addAttribute("listOrientador",listOrientador);*/
		model.addAttribute("arr",arr);
		return "findResult";
	}
	
}
