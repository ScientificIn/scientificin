package com.scientificin.controllers.in;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scientificin.repositories.AlunoRepository;
import com.scientificin.repositories.EstagiarioRepository;
import com.scientificin.repositories.EstagioRepository;
import com.scientificin.repositories.OrientadorRepository;
import com.scientificin.repositories.SociedadeRepository;

@Controller
@RequestMapping("/in")
public class MatcherController {
	
	@Autowired EstagioRepository EstRep;
	@Autowired EstagiarioRepository EstagiarioRep;
	@Autowired SociedadeRepository SocioRep;	
	@Autowired OrientadorRepository OrientadorRep;
	@Autowired AlunoRepository AlunoRep;

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
