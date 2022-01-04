package com.johnrteixeira.springpetclinic.controllers;

import com.johnrteixeira.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerservice;

    public OwnerController(OwnerService ownerservice) {
        this.ownerservice = ownerservice;
    }

    @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerservice.findAll());

        return "owners/index";
    }
}
