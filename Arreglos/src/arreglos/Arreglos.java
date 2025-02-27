
package arreglos;

public class Arreglos {

    public static void main(String[] args) {
        int edades [];
        
        edades = new int [3];
        
        edades[0] = 30;
        edades[1] = 24;
        edades[2] = 18;
        
        System.out.println("Edad 1:"+edades [0]);
        System.out.println("Edad 2:"+edades [1]);
        System.out.println("Edad 3:"+edades [2]);
        
        
        Persona personas[];
        
        personas = new Persona[4];
        
        personas[0] = new Persona("don cheto");
        personas[1] = new Persona("AMLO");
        personas[2] = new Persona("Maduro");
        
        System.out.println("");
        System.out.println("Persona:"+personas[0]);
        System.out.println("Persona:"+personas[1]);
        System.out.println("Persona:"+personas[2]);
        
        String nombres[] ={"Sara","Laura","Carlos","Carmen"};
        
        System.out.println("");
        for(int i = 0;i<nombres.length;i++){
              System.out.println("Arreglo de incices"+i+":"+nombres[i]);
        }
        
           
    }
    
}
