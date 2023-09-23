/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teatro;

import java.util.ArrayList;
import java.util.List;

public class Teatro {
    private static Teatro instance;
    private List<Obra> obras;
    
    private Teatro() {
        obras = new ArrayList<>();
    }

    public static Teatro getInstance() {
        if (instance == null) {
            instance = new Teatro();
        }
        return instance;
    }
    
    public void agregarObra(Obra obra) {
        obras.add(obra);
    }
    
    public void eliminarObra(Obra obra) {
        obras.remove(obra);
    }
    
    public List<Obra> obtenerObras() {
        return obras;
    }
    
    public void programarFuncion(Obra obra, Funcion funcion) {
        obra.agregarFuncion(funcion);
    }
    
    public void venderBoletos(Funcion funcion, int cantidad) {
        funcion.venderBoletos(cantidad);
    }
    
    // Otros métodos relacionados con la administración de obras y funciones
    
    public static void main(String[] args) {
        // Ejemplo de uso de la clase Teatro
        Teatro teatro = Teatro.getInstance();

        // Crear obras y funciones
        Obra obra1 = new Obra("Hamlet");
        Funcion funcion1 = new Funcion("Función 1", 100.0, 50);
        Funcion funcion2 = new Funcion("Función 2", 120.0, 60);

        // Agregar obras y programar funciones
        teatro.agregarObra(obra1);
        teatro.programarFuncion(obra1, funcion1);
        teatro.programarFuncion(obra1, funcion2);

        // Vender boletos
        teatro.venderBoletos(funcion1, 10);
        teatro.venderBoletos(funcion2, 20);

        // Obtener información
        List<Funcion> funcionesDisponibles = teatro.obtenerFuncionesDisponibles();
        for (Funcion funcion : funcionesDisponibles) {
            System.out.println("Función: " + funcion.getNombre());
            System.out.println("Boletos disponibles: " + teatro.obtenerBoletosDisponibles(funcion));
        }
    }

    private List<Funcion> obtenerFuncionesDisponibles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String obtenerBoletosDisponibles(Funcion funcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
