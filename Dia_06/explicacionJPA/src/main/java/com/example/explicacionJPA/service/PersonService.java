/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.explicacionJPA.service;

import com.example.explicacionJPA.model.Person;
import com.example.explicacionJPA.repository.PersonRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camper
 */
@Service
public class PersonService {
    
    @Autowired
    private PersonRepository personRepository;
    
    //Obtener todas las personas
    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }
    
    //Obtener persona por ID
    public Optional<Person> getPersonId(Long id){
        return personRepository.findById(id);
    }
    
    //Guardar persona
    public Person savePerson(Person person){
        return personRepository.save(person);
    }
    
    // Eliminar persona
    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }
    
    //Actualizar persona por ID
    public Person updatePerson(Long id, Person personDeteails){
        Person person = personRepository.findById(id).orElseThrow();
        person.setName(personDeteails.getName());
        person.setAge(personDeteails.getAge());
        return personRepository.save(person);
    }
}
