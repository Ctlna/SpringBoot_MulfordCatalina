package com.example.sistemaRestaurantes.service;

package com.example.sistemaRestaurantes.model.Mesas;
import com.example.sistemaRestaurantes.repository.MesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MesasService {

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

}
