
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> numeros = new ArrayList<>();
            
            System.out.print("¿Cuántos números desea ingresar?: ");
            int cantidad = sc.nextInt();
            
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                int numero = sc.nextInt();
                
                numeros.add(numero);
            }
            
            System.out.println("\nNúmeros pares:");
            
            for (Integer numero : numeros) {
                
                if (numero % 2 == 0) {
                    System.out.println(numero);
                }
            }
        }
    }
}