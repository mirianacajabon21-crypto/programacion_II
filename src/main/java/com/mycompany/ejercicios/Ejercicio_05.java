
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<String> nombres = new ArrayList<>();
            
            nombres.add("Juan");
            nombres.add("María");
            nombres.add("Pedro");
            nombres.add("Ana");
            nombres.add("Carlos");
            
            System.out.print("Ingrese el nombre que desea buscar: ");
            String nombre = sc.nextLine();
            
            if (nombres.contains(nombre)) {
                System.out.println("El nombre sí existe en la lista.");
            } else {
                System.out.println("El nombre no existe en la lista.");
            }
        }
    }
}