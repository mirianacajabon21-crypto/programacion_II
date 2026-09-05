
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<String> elementos = new ArrayList<>();
            
            int opcion;
            
            do {
                System.out.println("\n===== MENÚ =====");
                System.out.println("1. Agregar elemento");
                System.out.println("2. Mostrar elementos");
                System.out.println("3. Eliminar por índice");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                
                opcion = sc.nextInt();
                sc.nextLine();
                
                switch (opcion) {
                    
                    case 1 -> {
                        System.out.print("Ingrese un elemento: ");
                        String elemento = sc.nextLine();
                        elementos.add(elemento);
                        System.out.println("Elemento agregado.");
                    }
                        
                    case 2 -> {
                        System.out.println("\nElementos:");
                        
                        for (int i = 0; i < elementos.size(); i++) {
                            System.out.println(i + " - " + elementos.get(i));
                        }
                    }
                        
                    case 3 -> {
                        if (elementos.isEmpty()) {
                            System.out.println("La lista está vacía.");
                        } else {
                            System.out.print("Ingrese el índice a eliminar: ");
                            int indice = sc.nextInt();
                            
                            if (indice >= 0 && indice < elementos.size()) {
                                elementos.remove(indice);
                                System.out.println("Elemento eliminado.");
                            } else {
                                System.out.println("Índice no válido.");
                            }
                        }
                    }
                        
                    case 4 -> System.out.println("Programa finalizado.");
                        
                    default -> System.out.println("Opción no válida.");
                }
                
            } while (opcion != 4);
        }
    }
}