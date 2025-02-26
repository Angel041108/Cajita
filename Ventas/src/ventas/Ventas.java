
package ventas;

import com.jh.ventas.*;

public class Ventas {

   
    public static void main(String[] args) {
      Producto p1= new Producto("Camisa",450.00);
      Producto p2= new Producto("Aire",1650.00);
      Producto p3= new Producto("PC",14000.00);
      Producto p4= new Producto("Tennis",2450.00);
      Producto p5= new Producto("Short",450.00);
      Producto p6= new Producto("guantes",50.00);
      Producto p7= new Producto("MVC2",450.00);
      Producto p8= new Producto("LEGO",450.00);
      Producto p9= new Producto("PlayDohl",450.00);
      Producto p10= new Producto("FC 25",450.00);
      Producto p11= new Producto("Resident Evil 2",450.00);
      Producto p12= new Producto("EA SPORTS URFC 5",450.00);
      Producto p13= new Producto("WWE 2K25",450.00);
      Producto p14= new Producto("GTA 6",450.00);
      Producto p15= new Producto("MAX STEEL",450.00);
      
      Orden orden1 = new Orden();
      
      
      orden1.agregarProducto(p1);
      orden1.agregarProducto(p2);
      orden1.agregarProducto(p3);
      orden1.agregarProducto(p4);
      orden1.agregarProducto(p5);
      
       Orden orden2 = new Orden();
    
      orden2.agregarProducto(p6);
      orden2.agregarProducto(p7);
      orden2.agregarProducto(p8);
      orden2.agregarProducto(p9);
      orden2.agregarProducto(p10);  
      
       Orden orden3 = new Orden();
    
      orden3.agregarProducto(p11);
      orden3.agregarProducto(p12);
      orden3.agregarProducto(p13);
      orden3.agregarProducto(p14);
      orden3.agregarProducto(p15);
      
      
       orden1.mostrarOrden();
       orden2.mostrarOrden();
       orden3.mostrarOrden();
      
    
    }
 
}
