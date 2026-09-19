package com.mycompany.ejercicios;

import java.util.ArrayList;

class FacturaCliente {
    private int idFactura;
    private String cliente;
    private double monto;

    public FacturaCliente(int idFactura, String cliente, double monto) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.monto = monto;
    }

    public String getCliente() { return cliente; }
    
    @Override
    public String toString() {
        return "Factura #" + idFactura + " | Cliente: " + cliente + " | Monto: Q" + monto;
    }
}

public class Ejercicio9 {
    public static void main(String[] args) {
        ArrayList<FacturaCliente> listado = new ArrayList<>();
        listado.add(new FacturaCliente(101, "Sistemas S.A.", 1500.0));
        listado.add(new FacturaCliente(102, "Alimentos S.A.", 3000.0));
        listado.add(new FacturaCliente(103, "Sistemas S.A.", 850.0));

        ArrayList<FacturaCliente> filtradas = buscarPorCliente(listado, "Sistemas S.A.");

        System.out.println("--- Facturas encontradas para el cliente ---");
        for (FacturaCliente f : filtradas) {
            System.out.println(f);
        }
    }

    public static ArrayList<FacturaCliente> buscarPorCliente(ArrayList<FacturaCliente> lista, String nombreBuscar) {
        ArrayList<FacturaCliente> filtradas = new ArrayList<>();
        for (FacturaCliente f : lista) {
            if (f.getCliente().equalsIgnoreCase(nombreBuscar)) {
                filtradas.add(f);
            }
        }
        return filtradas;
    }
}
