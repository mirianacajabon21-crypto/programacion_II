
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_02{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = sc.nextInt();

            numeros.add(numero);
        }

        System.out.println("\nElementos del ArrayList:");

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        sc.close();
    }
}