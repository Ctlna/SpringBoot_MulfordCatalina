package com.example.Trabajo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int identificacion;
    private String rol;
    private Date fecha_nacimiento;

    public Empleado() {
    }

    public Empleado(String nombre, int identificacion, String rol, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.rol = rol;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
