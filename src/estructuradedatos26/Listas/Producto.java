/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos26.Listas;

/**
 *
 * @author rafay
 */
public class Producto {
    
    private String nombre;
    private double precio;
    private String marca;
    private int stock;

    public Producto() {
    }

    public Producto(String nombre, double precio, String marca, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.stock = stock;
    }

        @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + ", stock=" + stock + '}';
    }
    
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


      
}
