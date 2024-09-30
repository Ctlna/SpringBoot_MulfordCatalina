package com.example.Trabajo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Recibo_Unitario")
public class ReciboUnitario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int id_mercancia;
    private int precio_unidad;
    private int cantidad;
    private Date fecha_pedido;

    public ReciboUnitario() {
    }

    public ReciboUnitario(int id_mercancia, int precio_unidad, int cantidad, Date fecha_pedido) {
        this.id_mercancia = id_mercancia;
        this.precio_unidad = precio_unidad;
        this.cantidad = cantidad;
        this.fecha_pedido = fecha_pedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getId_mercancia() {
        return id_mercancia;
    }

    public void setId_mercancia(int id_mercancia) {
        this.id_mercancia = id_mercancia;
    }

    public int getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(int precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }
}
