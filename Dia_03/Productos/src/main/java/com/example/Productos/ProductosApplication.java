package com.example.Productos;

import com.example.Productos.modelo.Sistema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductosApplication.class, args);

		boolean x = true;
		Sistema sistem = new Sistema();


		Scanner scanner = new Scanner(System.in);
		int option;

		while (x) {
			System.out.println("Menu:");
			System.out.println("1. Mostrar todos los productos");
			System.out.println("2. Crear un producto");
			System.out.println("3. Editar un producto");
			System.out.println("0. Salir");
			option = scanner.nextInt();

			switch (option) {
				case 1:
					Sistema s = new Sistema();
					s.mostrarProducto();
					break;
				case 2:
					Sistema i = new Sistema();
					i.crearProducto();
					break;
				case 3:
                        /*Sistema t = new Sistema();
                        t.editarProducto();*/
					break;
				case 0:
					System.out.println("Gracias por ingresar, no vuelva");
					x = false;
					scanner.close();
					break;
				default:
					System.out.println("No se reconocio la opcion.");
					break;
			}
		}
	}

}
