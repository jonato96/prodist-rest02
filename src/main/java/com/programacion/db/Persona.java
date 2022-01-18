package com.programacion.db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String direccion;
}
