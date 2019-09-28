package com.diro.sfgpetclicnic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diro.sfgpetclicnic.services.VetService;

@Controller
public class VetController {

	private final VetService vetService;

	@RequestMapping({ "", "/vets", "/vets/index", "/vets/index.html" })
	public String listVets(Model model) {
		model.addAttribute("vets",vetService.findAll());
		return "vets/index";
	}

	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}
}
