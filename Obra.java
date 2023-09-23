
package com.mycompany.teatro;

import java.util.ArrayList;
import java.util.List;
public class Obra {
    private String nombre;
    private List<Funcion> funciones;

    public Obra(String nombre) {
        this.nombre = nombre;
        funciones = new ArrayList<>();
    }

    public void agregarFuncion(Funcion funcion) {
        funciones.add(funcion);
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public List<Funcion> getFuncionesDisponibles() {
        List<Funcion> funcionesDisponibles = new ArrayList<>();
        for (Funcion funcion : funciones) {
            if (funcion.getBoletosDisponibles() > 0) {
                funcionesDisponibles.add(funcion);
            }
        }
        return funcionesDisponibles;
    }

    // Otros métodos relacionados con la obra
}
