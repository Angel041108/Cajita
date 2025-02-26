
package com.jh.ventas;


public class Orden  {
    private final int idOrden;
    private  final Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int maxProductos = 10;
    
    public Orden(){
        this.idOrden= ++contadorOrdenes;
        productos = new Producto[maxProductos];
    }
    public boolean agregarProducto(Producto producto){
        if(contadorProductos < maxProductos){
            productos[contadorProductos++]= producto;
            return true;
        }else{
            System.out.println("Se ha superado el maximo de productos:"+maxProductos);
            return false;
        }
    }
    public double calcularTotal(){
        double total = 0;
        for(int i=0;i<contadorProductos;i++){
            total += productos[i].getPrecio();
        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("Orden #"+idOrden);
        System.out.println("Total $"+calcularTotal());
        System.out.println("Productos");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);
        }
    }
}
