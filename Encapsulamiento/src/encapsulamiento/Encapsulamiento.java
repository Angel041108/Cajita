
package encapsulamiento;

public class Encapsulamiento {

   
    public static void main(String[] args) {
       Persona p1 = new Persona("juan","perez",false);
       
        System.out.println("nombre de p1: " +p1.getNombre());
        
        Persona p2 = new Persona("Karla","gonzalez",false);
        System.out.println("estado de objeto p2;" + p2);
        
        p2.setBorrado(true);
        System.out.println("Estado de objeto p2:" + p2);
        
        Persona p3 = new Persona();
        System.out.println("Estado de objeto p3:" + p3);
    }
    
}
