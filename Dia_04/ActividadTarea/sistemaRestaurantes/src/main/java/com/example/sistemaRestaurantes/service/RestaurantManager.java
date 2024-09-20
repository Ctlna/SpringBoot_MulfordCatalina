package com.example.sistemaRestaurantes.service;

import com.example.sistemaRestaurantes.model.Platos;
import com.example.sistemaRestaurantes.model.Mesas;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RestaurantManager {

    @PersistenceContext
    private EntityManager entityManager;

    // Operaciones CRUD para Platos

    @Transactional
    public Platos guardarPlato(Platos plato) {
        entityManager.persist(plato);
        return plato;
    }

    @Transactional
    public Platos actualizarPlato(Long id, Platos detallePlato) {
        Platos plato = entityManager.find(Platos.class, id);
        if (plato == null) {
            throw new IllegalArgumentException("Plato no encontrado");
        }
        plato.setNombre(detallePlato.getNombre());
        plato.setPrecio(detallePlato.getPrecio());
        plato.setDisponibilidad(detallePlato.getDisponibilidad());
        return plato;
    }

    @Transactional
    public void eliminarPlato(Long id) {
        Platos plato = entityManager.find(Platos.class, id);
        if (plato != null) {
            entityManager.remove(plato);
        }
    }

    @Transactional
    public List<Platos> obtenerTodosLosPlatos() {
        return entityManager.createQuery("SELECT p FROM Platos p", Platos.class).getResultList();
    }

    // Operaciones CRUD para Mesas

    @Transactional
    public Mesas registrarMesa(Mesas mesa) {
        entityManager.persist(mesa);
        return mesa;
    }

    @Transactional
    public Mesas actualizarMesa(Long id, Boolean estaOcupada) {
        Mesas mesa = entityManager.find(Mesas.class, id);
        if (mesa == null) {
            throw new IllegalArgumentException("Mesa no encontrada");
        }
        mesa.setOcupada(estaOcupada);
        return mesa;
    }

    @Transactional
    public void eliminarMesa(Long id) {
        Mesas mesa = entityManager.find(Mesas.class, id);
        if (mesa != null) {
            entityManager.remove(mesa);
        }
    }

    @Transactional
    public List<Mesas> obtenerEstadoMesas() {
        return entityManager.createQuery("SELECT m FROM Mesas m", Mesas.class).getResultList();
    }
}
