package com.adopiluv.controller;

import com.adopiluv.model.Persona;
import com.adopiluv.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @Autowired
    private IPersonaRepository repository;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",required = false,defaultValue = "World") String name, Model model) {

        Persona p =new Persona();
        p.setIdPersona(1);
        p.setNome("Kelvin");
        repository.save(p);

        model.addAttribute("name", name);
        return "greeting";
    }
}
