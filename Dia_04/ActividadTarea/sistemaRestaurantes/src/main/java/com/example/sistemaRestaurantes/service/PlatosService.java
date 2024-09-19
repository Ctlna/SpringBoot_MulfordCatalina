package com.example.sistemaRestaurantes.service;

package com.example.sistemaRestaurantes.model.Platos;
import com.example.sistemaRestaurantes.repository.PlatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatosService {

    @Autowired
    private PlatosRepository platosRepository;

    // Agregar nuevos platos
    public Platos guardarPlatos(Platos platos){
        return platosRepository.save(platos);
    }

    // Platos disponibles
    // MODIFICAR detalles de un plato
    // Eliminar platos

}
