package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Collections;

public class EjercicioVentas {
    public static void main(String[] args) {
        ArrayList<Double> ventasMes = new ArrayList<>();
        // Datos de ejemplo para una semana demostrativa
        ventasMes.add(1500.0);
        ventasMes.add(2300.0);
        ventasMes.add(950.0);
        ventasMes.add(4100.0);
        ventasMes.add(1200.0);
        ventasMes.add(3100.0);
        ventasMes.add(1800.0);

        double promedio = calcularPromedio(ventasMes);

        System.out.println("--- Reporte Estadístico de Ventas ---");
        System.out.println("Promedio mensual: Q" + promedio);
        System.out.println("Venta máxima: Q" + obtenerMaximo(ventasMes));
        System.out.println("Venta mínima: Q" + obtenerMinimo(ventasMes));
        System.out.println("Días por encima del promedio: " + contarDiasSuperiores(ventasMes, promedio));
    }

    public static double calcularPromedio(ArrayList<Double> ventas) {
        if (ventas.isEmpty()) return 0.0;
        double suma = 0;
        for (double v : ventas) {
            suma += v;
        }
        return suma / ventas.size();
    }

    public static double obtenerMaximo(ArrayList<Double> ventas) {
        if (ventas.isEmpty()) return 0.0;
        return Collections.max(ventas);
    }

    public static double obtenerMinimo(ArrayList<Double> ventas) {
        if (ventas.isEmpty()) return 0.0;
        return Collections.min(ventas);
    }

    public static int contarDiasSuperiores(ArrayList<Double> ventas, double promedio) {
        int dias = 0;
        for (double v : ventas) {
            if (v > promedio) {
                dias++;
            }
        }
        return dias;
    }
}
