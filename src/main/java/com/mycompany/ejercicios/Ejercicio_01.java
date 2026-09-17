
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_01{
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<String> elementos = new ArrayList<>();
            
            String elemento;
            
            System.out.println("Ingrese elementos (escriba 'fin' para terminar):");
            
            do {
                System.out.print("Elemento: ");
                elemento = sc.nextLine();
                
                if (!elemento.equalsIgnoreCase("fin")) {
                    elementos.add(elemento);
                }
                
            } while (!elemento.equalsIgnoreCase("fin"));
            
            System.out.println("\nElementos ingresados:");
            
            for (String e : elementos) {
                System.out.println(e);
            }
        }
    }
}