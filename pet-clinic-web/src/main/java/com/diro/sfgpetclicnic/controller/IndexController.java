package com.diro.sfgpetclicnic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diro.sfgpetclicnic.services.OwnerService;

@Controller
public class IndexController {

	OwnerService ownerService;

	public IndexController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@RequestMapping({ "", "/", "index", "index.html" })
	public String index(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "index";
	}
}
