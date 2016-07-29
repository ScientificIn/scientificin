package com.scientificin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExternalPagesController {

	@RequestMapping({"/login", "/"})
	public String index (Model model) {
		return "index";
	}
}
