package com.example.sistemaRestaurantes.service;

import com.example.sistemaRestaurantes.model.Platos;
import com.example.sistemaRestaurantes.model.Mesas;
import com.example.sistemaRestaurantes.repository.MesasRepository;
import com.example.sistemaRestaurantes.repository.PlatosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantManager {

    // -------------------- Mesas
    
    @Autowired
    private MesasRepository mesasRepository;

    // Registrar mesas
    public Mesas registrarMesas(Mesas mesas){
        return mesasRepository.save(mesas);
    }

    // Obtener el estado de las mesas
    public List<Mesas> obtenerEstadoMesas() {
        return mesasRepository.findAll();
    }
    
    // Cambiar el estado de una mesa
    public Mesas actualizarEstadoMesa(Long id, Boolean estaOcupada){
        Mesas mesa = mesasRepository.findById(id).orElseThrow();
        mesa.setOcupada(estaOcupada);
        return mesasRepository.save(mesa);
    }
    
    // Eliminar platos
    public void eliminarMesas(Long id){
        mesasRepository.deleteById(id);
    }
    
    
    // ---------------------- Platos
    
    @Autowired
    private PlatosRepository platosRepository;

    // Agregar nuevos platos
    public Platos guardarPlatos(Platos platos){
        return platosRepository.save(platos);
    }

    // Platos disponibles
    public List<Platos> obtenerPlatosDisponibles() {
        return platosRepository.findAll();
    }
    
    // MODIFICAR detalles de un plato
    public Platos actualizarPlatos(Long id, Platos detallePlato){
        Platos plato = platosRepository.findById(id).orElseThrow();
        plato.setNombre(detallePlato.getNombre());
        plato.setPrecio(detallePlato.getPrecio());
        plato.setDisponibilidad(detallePlato.getDisponibilidad());
        return platosRepository.save(plato);
    }
    
    // Eliminar platos
    public void eliminarPlatos(Long id){
        platosRepository.deleteById(id);
    }

}
