/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.explicacionJPA.repository;

import com.example.explicacionJPA.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author camper
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    
}
