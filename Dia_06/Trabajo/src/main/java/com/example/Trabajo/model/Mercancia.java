package com.example.Trabajo.model;

import jakarta.persistence.*;

@Entity
@Table(name="Mercancia")
public class Mercancia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int numero_serie;
    private int precio_compra;
    private int precio_venta;

    public Mercancia() {
    }

    public Mercancia(String nombre, int numero_serie, int precio_compra, int precio_venta) {
        this.nombre = nombre;
        this.numero_serie = numero_serie;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
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

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public int getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(int precio_compra) {
        this.precio_compra = precio_compra;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }
}
