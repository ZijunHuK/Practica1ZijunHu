
package com.tiernoparla.practica1zijunhu;

    import java.util.*;

public class Practica {
    public static void main(String[] args) {
     
    //PARTE 1
    
    //introducir número
    Scanner sca = new Scanner(System.in);

    System.out.println("Introduce cantidad de tu mensaje: ");
    
    int longitud = sca.nextInt();

    System.out.println("cantidad que tengo son: " + longitud);
    
    //generar el número al 0 y 1
    Random ram = new Random();
    
    int binario = ram.nextInt(2);
    
    for (int i = 0; i < longitud; i++) {
      System.out.print(binario + " ");
    } //for i
    
        System.out.println(" ");

    //PARTE 2
    
    //cantidad mínima de bits de redundancia necesarios
    for (int j = 1; j < longitud; j++) {
        int elevado = (int) Math.pow(2, j)-(j+1);
        if (elevado >= longitud) {
            System.out.println("está dentro de 2 elevado a " + j);
            } //if
        
    // rellenar
            for (int k = 0; k < j; k++) {
                System.out.print(binario + " ");
            } //for k
            
            
            break;
        } //for j
    
    
        
        
        
        
    } //main
} //Practica
