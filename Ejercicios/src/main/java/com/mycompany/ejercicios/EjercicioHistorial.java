package com.mycompany.ejercicios;

import java.util.ArrayList;

class HistorialNavegacion {
    private ArrayList<String> historial;
    private final int LIMITE_MAXIMO = 10;

    public HistorialNavegacion() {
        this.historial = new ArrayList<>();
    }

    public void visitarPagina(String url) {
        if (historial.size() >= LIMITE_MAXIMO) {
            historial.remove(0); // Elimina el elemento más antiguo en la primera posición
        }
        historial.add(url);
    }

    public void mostrarHistorial() {
        System.out.println("Historial de Navegación (Más antiguo al más reciente):");
        for (int i = 0; i < historial.size(); i++) {
            System.out.println((i + 1) + ". " + historial.get(i));
        }
        System.out.println();
    }
}

public class EjercicioHistorial {
    public static void main(String[] args) {
        HistorialNavegacion navegador = new HistorialNavegacion();
        
        // Simulamos visitar 12 páginas consecutivas
        for (int i = 1; i <= 12; i++) {
            navegador.visitarPagina("https://www.pagina-ejemplo-" + i + ".com");
        }
        
        // Debería mostrar únicamente de la página 3 a la 12
        navegador.mostrarHistorial();
    }
}
