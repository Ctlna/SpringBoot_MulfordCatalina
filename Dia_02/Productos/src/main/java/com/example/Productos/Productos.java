/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Productos;

/**
 *
 * @author camper
 */
public class Productos implements Datos {
    public String nombre;
    public String caracteristica;
    public String rango;

    public Productos(String nombre, String caracteristica, String rango) {
        this.nombre = nombre;
        this.caracteristica = caracteristica;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String datos() {
        return "El producto "+ getNombre()+ " se encuentra en un rango "+getRango()
                +" y sus caracteristicas son: "+getCaracteristica(); 
        
    }
    
}
