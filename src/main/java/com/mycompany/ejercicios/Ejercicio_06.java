
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<String> tareas = new ArrayList<>();
            
            int opcion;
            
            do {
                System.out.println("\n===== ACTIVIDADES PENDIENTES =====");
                System.out.println("1. Agregar tarea");
                System.out.println("2. Mostrar tareas");
                System.out.println("3. Marcar como completada");
                System.out.println("4. Eliminar tarea");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                
                opcion = sc.nextInt();
                sc.nextLine();
                
                switch (opcion) {
                    
                    case 1:
                        System.out.print("Ingrese la tarea: ");
                        String tarea = sc.nextLine();
                        
                        tareas.add(tarea);
                        
                        System.out.println("Tarea agregada.");
                        break;
                        
                    case 2:
                        if (tareas.isEmpty()) {
                            System.out.println("No hay tareas pendientes.");
                        } else {
                            System.out.println("\nTareas pendientes:");
                            
                            for (int i = 0; i < tareas.size(); i++) {
                                System.out.println(i + " - " + tareas.get(i));
                            }
                        }
                        break;
                        
                    case 3:
                        if (tareas.isEmpty()) {
                            System.out.println("No hay tareas.");
                        } else {
                            System.out.print("Ingrese el índice de la tarea completada: ");
                            int indice = sc.nextInt();
                            
                            if (indice >= 0 && indice < tareas.size()) {
                                System.out.println(
                                        "Tarea completada: " + tareas.get(indice)
                                );
                                
                                tareas.remove(indice);
                            } else {
                                System.out.println("Índice no válido.");
                            }
                        }
                        break;
                        
                    case 4:
                        if (tareas.isEmpty()) {
                            System.out.println("No hay tareas.");
                        } else {
                            System.out.print("Ingrese el índice de la tarea a eliminar: ");
                            int indice = sc.nextInt();
                            
                            if (indice >= 0 && indice < tareas.size()) {
                                tareas.remove(indice);
                                System.out.println("Tarea eliminada.");
                            } else {
                                System.out.println("Índice no válido.");
                            }
                        }
                        break;
                        
                    case 5:
                        System.out.println("Programa finalizado.");
                        break;
                        
                    default:
                        System.out.println("Opción no válida.");
                }
                
            } while (opcion != 5);
        }
    }
}
