
package com.mycompany.ejercicios;



import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_10 {
    

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.print("¿Cuántos empleados desea ingresar? ");
        int cantidad = teclado.nextInt();
        teclado.nextLine();

        double sumaSalarios = 0;

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nEmpleado " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Salario: Q");
            double salario = teclado.nextDouble();
            teclado.nextLine();

            Empleado empleado = new Empleado(nombre, salario);

            empleados.add(empleado);

            sumaSalarios = sumaSalarios + salario;
        }

        System.out.println("\n===== EMPLEADOS =====");

        for (Empleado empleado : empleados) {
            empleado.mostrarDatos();
        }

        double promedio = sumaSalarios / empleados.size();

        System.out.println("\nPromedio de salarios: Q" + promedio);
    }
}