
package com.mycompany.ejercicios;

import java.util.ArrayList;

class Empleado {
    private final String nombre;
    private final String departamento;
    private final double salario;

    public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getDepartamento() { 
        return departamento; 
    }
    
    public double getSalario() { 
        return salario; 
    }

    @Override
    public String toString() {
        return "Empleado [Nombre=" + nombre + ", Departamento=" + departamento + ", Salario=Q" + salario + "]";
    }
}

public class EjercicioEmpleados {
    public static void main(String[] args) {
        ArrayList<Empleado> nomina = new ArrayList<>();
        nomina.add(new Empleado("Carlos Gómez", "Ventas", 6500.0));   // Cumple
        nomina.add(new Empleado("Ana Martínez", "Ventas", 4200.0));   // No cumple salario
        nomina.add(new Empleado("Luis Rodas", "IT", 8000.0));         // No cumple departamento
        nomina.add(new Empleado("Marta Estrada", "Ventas", 5100.0));  // Cumple

        // Filtrar empleados de "Ventas" con salario mayor a Q5,000
        ArrayList<Empleado> filtrados = filtrarPersonal(nomina, "Ventas");

        System.out.println("--- Empleados que cumplen con el filtro ---");
        for (Empleado e : filtrados) {
            System.out.println(e);
        }
    }

    public static ArrayList<Empleado> filtrarPersonal(ArrayList<Empleado> lista, String deptoTarget) {
        ArrayList<Empleado> resultado = new ArrayList<>();
        for (Empleado e : lista) {
            if (e.getDepartamento().equalsIgnoreCase(deptoTarget) && e.getSalario() > 5000) {
                resultado.add(e);
            }
        }
        return resultado;
    }
}
