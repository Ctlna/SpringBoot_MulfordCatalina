/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.explicacionJPA.controller;

import com.example.explicacionJPA.model.Person;
import com.example.explicacionJPA.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camper
 */
@RestController
@RequestMapping("/api/persons")
public class PersonController {
    
    @Autowired
    private PersonService personService;
    
    //Obtener todas las personas
    // localhost:8080/api/person con verbo Get
    @GetMapping
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }
    
    // Persona por ID
    @GetMapping("/{id}")
    public Person getPersonId(@PathVariable Long id){
        return personService.getPersonId(id).orElseThrow();
    }
    
    // Crear una persona
    //{
    //"name":"Andres",
    //"age":"25"
    //}
    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personService.savePerson(person);
    }
    
    //Actualizar una persona
    //{
    //"name":"Pastrana",
    //"age":"36"
    //}
    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id,@RequestBody Person person){
        return personService.updatePerson(id, person);
    }
    
    // Eliminar persona
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
    }
}
