/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Productos;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Sistema import Datos{
    
    public void mostrarProducto(){
        if (productosList.isEmpty()) {
            System.out.println("No hay productos para mostrar.");
            return;
        }
        for (Productos producto : productosList) {
            System.out.println("-----------");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Característica: " + producto.getCaracteristica());
            System.out.println("Rango: " + producto.getRango());
            System.out.println("-----------");
        }
    }
    
    public void crearProducto(){
            System.out.println("-----------");
        System.out.println("Agregar la información paracrear un producto");
        Productos produ = new Productos();
        System.out.println(" ");
        System.out.println("Nombre del nuevo producto:");
	String n = scanner.nextLine();
	n = scanner.nextLine();
	produ.setNombre(n);
        System.out.println(" ");
        System.out.println("Caracteristica:");
	String c = scanner.nextLine();
        produ.setCaracteristica(c);
        System.out.println(" ");
        System.out.println("Rango:");
        String r = scanner.nextLine();
	produ.setTipo(r);
        
        Productos produ = new Productos(nombre, caracteristica, rango);
        System.out.println("Se guardo exitosamente");
            System.out.println("-----------");
    }
    
    public void editarProducto(){    
        System.out.println("-----------");
        System.out.println("Nombre del producto (actual: " + producto.getNombre() + "):");
        String nombre = scanner.nextLine();
        producto.setNombre(nombre);
        System.out.println("Característica (actual: " + producto.getCaracteristica() + "):");
        String caracteristica = scanner.nextLine();
        producto.setCaracteristica(caracteristica);
        System.out.println("Rango (actual: " + producto.getRango() + "):");
        String rango = scanner.nextLine();
        producto.setRango(rango);

        System.out.println("Producto editado exitosamente.");
        System.out.println("-----------");
    }
}
