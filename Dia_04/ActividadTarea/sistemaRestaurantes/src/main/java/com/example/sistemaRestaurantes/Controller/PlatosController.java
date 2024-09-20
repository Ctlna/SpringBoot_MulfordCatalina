package com.example.sistemaRestaurantes.controller;

import com.example.sistemaRestaurantes.model.Platos;
import com.example.sistemaRestaurantes.service.RestaurantManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/platos")
public class PlatosController {

    @Autowired
    private RestaurantManager restaurantManager;

    // Crear un nuevo plato
    @PostMapping
    public ResponseEntity<Platos> crearPlato(@RequestBody Platos plato) {
        Platos nuevoPlato = restaurantManager.guardarPlato(plato);
        return ResponseEntity.ok(nuevoPlato);
    }

    // Obtener todos los platos
    @GetMapping
    public ResponseEntity<List<Platos>> obtenerPlatos() {
        List<Platos> platos = restaurantManager.obtenerTodosLosPlatos();
        return ResponseEntity.ok(platos);
    }

    // Actualizar un plato
    @PutMapping("/{id}")
    public ResponseEntity<Platos> actualizarPlato(@PathVariable Long id, @RequestBody Platos detallePlato) {
        Platos platoActualizado = restaurantManager.actualizarPlato(id, detallePlato);
        return ResponseEntity.ok(platoActualizado);
    }

    // Eliminar un plato
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPlato(@PathVariable Long id) {
        restaurantManager.eliminarPlato(id);
        return ResponseEntity.noContent().build();
    }
}
