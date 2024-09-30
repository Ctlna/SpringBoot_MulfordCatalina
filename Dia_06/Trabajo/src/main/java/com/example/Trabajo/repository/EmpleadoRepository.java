package com.example.Trabajo.repository;

import com.example.Trabajo.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository <Empleado,Long> {
}
