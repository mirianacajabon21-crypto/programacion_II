
package com.mycompany.ejercicios;

import java.util.ArrayList;

class ItemCarrito {
    private String producto;
    private int cantidad;
    private double precioUnitario;

    public ItemCarrito(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public double getPrecioUnitario() { return precioUnitario; }

    public double getSubtotal() {
        return this.cantidad * this.precioUnitario;
    }

    @Override
    public String toString() {
        return producto + " x" + cantidad + " (Unitario: Q" + precioUnitario + ") - Subtotal: Q" + getSubtotal();
    }
}

class CarritoCompras {
    private ArrayList<ItemCarrito> listaItems;

    public CarritoCompras() {
        this.listaItems = new ArrayList<>();
    }

    public void agregarItem(ItemCarrito nuevoItem) {
        for (ItemCarrito item : listaItems) {
            if (item.getProducto().equalsIgnoreCase(nuevoItem.getProducto())) {
                item.setCantidad(item.getCantidad() + nuevoItem.getCantidad());
                return; // Termina el método ya que incrementó la cantidad
            }
        }
        listaItems.add(nuevoItem); // Si no existía, lo añade por primera vez
    }

    public void eliminarItem(String nombreProducto) {
        listaItems.removeIf(item -> item.getProducto().equalsIgnoreCase(nombreProducto));
    }

    public void vaciarCarrito() {
        listaItems.clear();
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : listaItems) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void imprimirTicket() {
        System.out.println("--- Contenido del Carrito ---");
        for (ItemCarrito item : listaItems) {
            System.out.println(item);
        }
        System.out.println("TOTAL RECAUDADO: Q" + calcularTotal() + "\n");
    }
}

public class EjercicioCarrito {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        carrito.agregarItem(new ItemCarrito("Leche", 2, 11.50));
        carrito.agregarItem(new ItemCarrito("Cereal", 1, 32.00));
        // Agregamos más de lo mismo para verificar que incremente cantidad y no se duplique
        carrito.agregarItem(new ItemCarrito("Leche", 3, 11.50)); 

        carrito.imprimirTicket();

        carrito.eliminarItem("Cereal");
        System.out.println("Después de eliminar 'Cereal':");
        carrito.imprimirTicket();
    }
}
