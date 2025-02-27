/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;


public class PruebaArimetica {
    public static void main(String args[]){
        Aritmetica obj1 = new Aritmetica();
        
        int resultado =obj1.sumar(5,3);
        
        System.out.println("Resultado:"+resultado);
        
        System.out.println("Resultado:"+obj1.sumar());
        
         Aritmetica obj2 = new Aritmetica(2,1);
         
         System.out.println("Resultado:"+obj2.sumar());
    }
}
