package com.example.sistemaRestaurantes.controller;

import com.example.sistemaRestaurantes.model.Mesas;
import com.example.sistemaRestaurantes.service.RestaurantManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mesas")
public class MesasController {

    @Autowired
    private RestaurantManager restaurantManager;

    // Crear una nueva mesa
    @PostMapping
    public ResponseEntity<Mesas> crearMesa(@RequestBody Mesas mesa) {
        Mesas nuevaMesa = restaurantManager.registrarMesa(mesa);
        return ResponseEntity.ok(nuevaMesa);
    }

    // Obtener todas las mesas
    @GetMapping
    public ResponseEntity<List<Mesas>> obtenerMesas() {
        List<Mesas> mesas = restaurantManager.obtenerEstadoMesas();
        return ResponseEntity.ok(mesas);
    }

    // Actualizar el estado de una mesa
    @PutMapping("/{id}")
    public ResponseEntity<Mesas> actualizarMesa(@PathVariable Long id, @RequestBody Boolean estadoOcupada) {
        Mesas mesaActualizada = restaurantManager.actualizarMesa(id, estadoOcupada);
        return ResponseEntity.ok(mesaActualizada);
    }

    // Eliminar una mesa
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMesa(@PathVariable Long id) {
        restaurantManager.eliminarMesa(id);
        return ResponseEntity.noContent().build();
    }
}
