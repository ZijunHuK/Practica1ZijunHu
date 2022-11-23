
package com.tiernoparla.practica1zijunhu;

    import java.util.*;

public class Practica {
    public static void main(String[] args) {
     
    //PARTE 1
    
    //introducir número
    Scanner sca = new Scanner(System.in);

    System.out.println("Introduce cantidad de tu mensaje: ");
    
    int num = sca.nextInt();

    System.out.println("cantidad que tengo son: " + num);
    
    //generar el número al 0 y 1
    Random ram = new Random();
    
    for (int i = 0; i < num; i++) {
      int binario = ram.nextInt(2);
      System.out.print(binario + " ");
    }
        System.out.println(" ");

    //PARTE 2
    
    int elevado = (int) Math.pow(2, 3)-(3+1);
    int elevado1 = (int) Math.pow(2, 4)-(4+1);
    if (elevado < num && num > elevado1) {
        System.out.println("true");
    }
    /*
    for (int j = 1; j < num; j++) {
        int elevado = (int) Math.pow(2, j)-(j+1);
        System.out.println("2elevado a " + j + " = " + elevado);
        if (num < elevado){
            System.out.println("true");   
        }
    }
    */ 
        
        
        
        
        
        
        
    } //main
} //Practica
