
package com.mycompany.ejercicios;

import java.util.ArrayList;

class Factura {
    private int idFactura;
    private String cliente;
    private double monto;

    public Factura(int idFactura, String cliente, double monto) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.monto = monto;
    }

    public double getMonto() { return monto; }
}

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();
        facturas.add(new Factura(1, "Corporación ABC", 2500.0));
        facturas.add(new Factura(2, "Tienda Central", 4300.50));

        System.out.println("Monto total facturado: Q" + calcularTotalFacturas(facturas));
    }

    public static double calcularTotalFacturas(ArrayList<Factura> lista) {
        double total = 0;
        for (Factura f : lista) {
            total += f.getMonto();
        }
        return total;
    }
}

