
package com.mycompany.ejercicios;


import java.util.ArrayList;

class Producto {
    private final int id;
    private final String nombre;
    private double precio;
    private final int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getStock() { 
        return stock; 
    }
    
    public double getPrecio() { 
        return precio; 
    }
    
    public void setPrecio(double precio) { 
        this.precio = precio; 
    }

    @Override
    public String toString() {
        return "Producto [ID=" + id + ", Nombre=" + nombre + ", Precio=Q" + precio + ", Stock=" + stock + "]";
    }
}

public class EjercicioProductos {
    public static void main(String[] args) {
        ArrayList<Producto> inventario = new ArrayList<>();
        inventario.add(new Producto(101, "Laptop Gamer", 12000.0, 4));  // Sube de precio
        inventario.add(new Producto(102, "Mouse Óptico", 150.0, 25));   // No cambia
        inventario.add(new Producto(103, "Teclado Mecánico", 450.0, 7)); // Sube de precio

        System.out.println("--- Inventario Inicial ---");
        for (Producto p : inventario) System.out.println(p);

        // Aplicamos un 10% de aumento a los productos con stock bajo
        actualizarPrecioStockBlow(inventario, 10.0);

        System.out.println("\n--- Inventario Después del Aumento (10%) ---");
        for (Producto p : inventario) System.out.println(p);
    }

    /**
     *
     * @param lista
     * @param porcentaje
     */
    public static void actualizarPrecioStockBlow(ArrayList<Producto> lista, double porcentaje) {
        for (Producto p : lista) {
          if (p.getStock() < 10) {
                double nuevoPrecio = p.getPrecio() * (1 + (porcentaje / 100));
                p.setPrecio(nuevoPrecio);
            }
        }
    }
}
