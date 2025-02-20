/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajita;


public class Cajita {
    //Atributos
    int ancho;
    int alto;
    int profundo;
    //constructor vacio
    Cajita(){}
    //constructor con 3 argumentos
    Cajita(int a,int b,int c){
        this.ancho=a;
        this.alto=b;
        this.profundo=c;
    }
    //Metodos
    int Cajita(int a,int b,int c){
        return a*b*c;
    }
    int Cajita(){
        return ancho*alto*profundo;
    }
}
