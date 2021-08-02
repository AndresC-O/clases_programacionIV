package com.programacioniva.api.controllers;

import com.programacioniva.api.entidades.Estudiante;
import com.programacioniva.api.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class EstudianteController {

    //Inyector de Dependencias.
    @Autowired
    EstudianteRepository repository;

    //*************************************************************
    @GetMapping("inicio")//GET
    @ResponseBody
    public Optional<Estudiante> inicio(){
        Optional<Estudiante> estudiante;
        estudiante = repository.findById(1);
        return estudiante;
    }
    //*************************************************************
    @PostMapping("/registrar")//POST
    @ResponseBody
    public Estudiante nuevo(@RequestBody Estudiante estudiante){
        repository.save(estudiante);
        return estudiante;
    }
    //*************************************************************
    @DeleteMapping("/eliminar")//DELETE
    @ResponseBody
    public Estudiante eliminar(@RequestBody Estudiante estudiante){
        repository.save(estudiante);
        return estudiante;
    }
    //*************************************************************
    @PutMapping("/eliminar")//PUT
    @ResponseBody
    public Estudiante actualizar(@RequestBody Estudiante estudiante){
        repository.save(estudiante);
        return estudiante;
    }
}
