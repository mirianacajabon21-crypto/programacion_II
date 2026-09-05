
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Double> calificaciones = new ArrayList<>();
            
            System.out.print("¿Cuántas calificaciones desea ingresar?: ");
            int cantidad = sc.nextInt();
            
            double suma = 0;
            
            for (int i = 0; i < cantidad; i++) {
                
                System.out.print("Calificación " + (i + 1) + ": ");
                double calificacion = sc.nextDouble();
                
                calificaciones.add(calificacion);
                suma += calificacion;
            }
            
            double promedio = suma / calificaciones.size();
            
            System.out.println("\nCalificaciones:");
            
            for (Double nota : calificaciones) {
                System.out.println(nota);
            }
            
            System.out.println("\nPromedio: " + promedio);
        }
    }
}