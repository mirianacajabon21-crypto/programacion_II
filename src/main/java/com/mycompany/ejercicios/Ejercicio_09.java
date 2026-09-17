
package com.mycompany.ejercicios;


public class Ejercicio_09 {
    
    private final String nombre;
    private final double salario;

    
    public Ejercicio_09 (String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void mostrarDatos() {
        System.out.println(
                "Nombre: " + nombre
                + " | Salario: Q" + salario
        );
    }
}