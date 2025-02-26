/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jh.ventas;


public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    private Producto(){
        this.idProducto = contadorProductos++;
    }
    
    
    public Producto(String nombre,double precio){
        this.nombre=nombre;
        this.precio=precio;
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

    @Override
    public String toString() {
        return "Producto{" + "IdProducto=" + idProducto + ", Nombre=" + nombre + ", Precio=" + precio + '}';
    }
    
}
