/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Productos.modelo;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
@AllArgsConstructor
@ToString
public class Sistema implements Datos {
    Scanner scanner = new Scanner(System.in);

    private ArrayList<Productos> cosa;
    public Sistema(){
        cosa = new ArrayList<>();
    }

    /*public void editarProducto(){
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
    }*/

    @Override
    public ArrayList<Productos> mostrarProducto() {
        cosa.forEach((n) -> muestra(n));
        return cosa;
    }

    public static void muestra(Productos a){
        System.out.println("-----------");
        System.out.println("Nombre: " + a.getNombre());
        System.out.println("Característica: " + a.getCaracteristica());
        System.out.println("Rango: " + a.getRango());
        System.out.println("-----------");
    }

    @Override
    public void crearProducto() {
        System.out.println("-----------");
        System.out.println("Agregar la información paracrear un producto");
        System.out.println(" ");

        Productos produ = new Productos();

        System.out.println("Nombre del nuevo producto:");
        String n = scanner.nextLine();
        produ.setNombre(n);
        System.out.println(" ");

        System.out.println("Caracteristica:");
        String c = scanner.nextLine();
        produ.setCaracteristica(c);
        System.out.println(" ");

        System.out.println("Rango:");
        String r = scanner.nextLine();
        produ.setRango(r);

        cosa.add(produ);

        System.out.println("Se guardo exitosamente");
        System.out.println("-----------");
    }
}
