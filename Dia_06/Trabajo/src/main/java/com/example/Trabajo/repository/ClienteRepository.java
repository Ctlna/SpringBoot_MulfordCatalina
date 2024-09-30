package com.example.Trabajo.repository;

import com.example.Trabajo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente,Long> {
}
