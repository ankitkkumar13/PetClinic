package com.diro.sfgpetclicnic.controller;

import com.diro.sfgpetclicnic.services.OwnerService;
import com.diro.sfgpetclicnic.services.VetService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    @RequestMapping({"", "/owners", "/owners/index", "/owners/index.html"})
    public String listVets(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping("/owners/find")
    public String find(Model model) {
        return "notimplemented";
    }
    public OwnerController(OwnerService ownerService) {
        super();
        this.ownerService = ownerService;
    }
}
