package com.adopiluv.rest;

import com.adopiluv.model.Persona;
import com.adopiluv.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class RestDemoController {

    @Autowired
    private IPersonaRepository repository;

    @GetMapping
    public List<Persona> listing(){

        return repository.findAll();
    }

    @PostMapping
    public void insert(@RequestBody Persona persona){

        repository.save(persona);
    }

    @PutMapping
    public void modify(@RequestBody Persona persona){

        repository.save(persona);
    }
    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable("id") Integer id){

        repository.deleteById(id);
    }
}
