package com.example.sistemaRestaurantes.service;

package com.example.sistemaRestaurantes.model.Platos;
import com.example.sistemaRestaurantes.repository.PlatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlatosService {

    @Autowired
    private PlatosRepository platosRepository;

    // Agregar nuevos platos
    public Platos guardarPlatos(Platos platos){
        return platosRepository.save(platos);
    }

    // Platos disponibles
    public List<Platos> obtenerPlatosDisponibles() {
        return platosRepository.findByDisponibilidadTrue();
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
