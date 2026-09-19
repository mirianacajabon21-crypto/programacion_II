package com.mycompany.ejercicios;

import java.util.ArrayList;

class ProductoB {
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    public ProductoB(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getStock() { return stock; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return nombre + " -> Q" + precio + " (Stock: " + stock + ")";
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<ProductoB> listado = new ArrayList<>();
        listado.add(new ProductoB(50, "Impresora", 1800.0, 3));
        listado.add(new ProductoB(51, "Bocinas", 350.0, 12));

        modificarPrecios(listado, 5.0); // 5% aumento

        for (ProductoB p : listado) System.out.println(p);
    }

    public static void modificarPrecios(ArrayList<ProductoB> lista, double porc) {
        for (ProductoB p : lista) {
            if (p.getStock() < 10) {
                p.setPrecio(p.getPrecio() * (1 + (porc / 100)));
            }
        }
    }
}
