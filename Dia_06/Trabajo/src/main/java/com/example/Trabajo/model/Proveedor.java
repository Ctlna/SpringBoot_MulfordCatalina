package com.example.Trabajo.model;

import jakarta.persistence.*;

@Entity
@Table(name="Proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int numero_contacto;
    private String nombre_contacto;
    private String direccion;

    public Proveedor() {
    }

    public Proveedor(String nombre, int numero_contacto, String nombre_contacto, String direccion) {
        this.nombre = nombre;
        this.numero_contacto = numero_contacto;
        this.nombre_contacto = nombre_contacto;
        this.direccion = direccion;
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

    public int getNumero_contacto() {
        return numero_contacto;
    }

    public void setNumero_contacto(int numero_contacto) {
        this.numero_contacto = numero_contacto;
    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }

    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}