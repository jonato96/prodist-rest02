package com.programacion.services;

import com.programacion.db.Persona;

import java.util.List;

public interface ServicioPersona {

    void create(Persona p);
    Persona findById(Integer id);
    List<Persona> findAll();
    void update(Integer id, Persona p);
    void delete(Integer id);


}
