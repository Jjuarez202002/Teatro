
package com.mycompany.teatro;


public class Funcion {
    private String nombre;
    private double precio;
    private int boletosDisponibles;

    public Funcion(String nombre, double precio, int boletosDisponibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.boletosDisponibles = boletosDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public int getBoletosDisponibles() {
        return boletosDisponibles;
    }

    public void venderBoletos(int cantidad) {
        if (cantidad <= boletosDisponibles) {
            boletosDisponibles -= cantidad;
        } else {
            System.out.println("No hay suficientes boletos disponibles para esta función.");
        }
    }

    public double calcularIngresos() {
        return precio * (double) (boletosDisponibles);
    }


}
