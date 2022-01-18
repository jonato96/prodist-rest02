package com.programacion.services;

import com.programacion.db.Persona;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@ApplicationScoped
public class ServicioPersonaImpl implements ServicioPersona{

    private Map<Integer, Persona> personas = new HashMap<>();

    {
        Persona p1 = new Persona(1, "Joanthan", "Quininde");
        Persona p2 = new Persona(1, "Jesus", "Quito");

        personas.put(p1.getId(),p1);
        personas.put(p2.getId(),p2);
    }

    @Override
    public void create(Persona p) {
        personas.put(p.getId(), p);
    }

    @Override
    public Persona findById(Integer id) {
        return personas.get(id);
    }

    @Override
    public List<Persona> findAll() {
        return new ArrayList<>(personas.values());
    }

    @Override
    public void update(Integer id, Persona p) {
        personas.put(id, p);
    }

    @Override
    public void delete(Integer id) {
        personas.remove(id);

    }
}
