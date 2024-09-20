/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.sistemaRestaurantes.Controller;

import com.example.sistemaRestaurantes.model.Mesas;
import com.example.sistemaRestaurantes.model.Platos;
import com.example.sistemaRestaurantes.service.RestaurantManager;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/restaurante")
public class EntityManager {
    
    @Autowired
    private RestaurantManager restaurantManager;
    
    // ------------------- Mesas
    
    // Crear una nueva mesa
    @PostMapping("/mesa")
    public Mesas crearMesa(@RequestBody Mesas mesa) {
        return restaurantManager.registrarMesas(mesa);
    }
    
    // Obtener todas las mesas
    @GetMapping("/mesa")
    public List<Mesas> obtenerMesas() {
        return restaurantManager.obtenerEstadoMesas();
    }
    
    // Actualizar el estado de una mesa
    @PutMapping("/mesa/{id}")
    public Mesas actualizarMesa(@PathVariable Long id, @RequestBody Boolean estadoOcupada) {
        return restaurantManager.actualizarEstadoMesa(id, estadoOcupada);
    }
    
    // Eliminar una mesa
    @DeleteMapping("/mesa/{id}")
    public void eliminarMesa(@PathVariable Long id) {
        restaurantManager.eliminarMesas(id);
    }
    
    // ------------------- Platos
    
    // Crear un nuevo plato
    @PostMapping("/plato")
    public Platos crearPlato(@RequestBody Platos plato) {
        return restaurantManager.guardarPlatos(plato);
    }
    
    // Obtener platos disponibles
    @GetMapping("/plato")
    public List<Platos> obtenerPlatos() {
        return restaurantManager.obtenerPlatosDisponibles();
    }
    
    // Actualizar un plato
    @PutMapping("/plato/{id}")
    public Platos actualizarPlato(@PathVariable Long id, @RequestBody Platos detallePlato) {
        return restaurantManager.actualizarPlatos(id, detallePlato);
    }
    
    // Eliminar un plato
    @DeleteMapping("/plato/{id}")
    public void eliminarPlato(@PathVariable Long id) {
        restaurantManager.eliminarPlatos(id);
    }
}
