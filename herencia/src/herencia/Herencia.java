
package herencia;


public class Herencia {

   
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan",25000);
        System.out.println("Empleado 1");
        System.out.println(e1);
        
        Empleado e2 = new Empleado("Maria",25000);
        e2.setEdad(32);
        e2.setGenero('F');
        e2.setDireccion("Escuinapa Sinaloa");
        System.out.println("Empleado 2");
        System.out.println(e2);
        
        Cliente c1 = new Cliente(new java.util.Date(),false);
        System.out.println("Cliente 1");
        System.out.println("c1");
        c1.setNombre("Manuelito");
        c1.setEdad(22);
        c1.setGenero('M');
        c1.setDireccion("Teacapan,Sinaloa");
        System.out.println(c1);
    }
    
}
