
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<String> nombres = new ArrayList<>();
            
            System.out.println("Ingrese 5 nombres:");
            
            for (int i = 0; i < 5; i++) {
                System.out.print("Nombre " + (i + 1) + ": ");
                String nombre = sc.nextLine();
                
                nombres.add(nombre);
            }
            
            System.out.println("\nNombres almacenados:");
            
            for (String nombre : nombres) {
                System.out.println(nombre);
            }
        }
    }
}