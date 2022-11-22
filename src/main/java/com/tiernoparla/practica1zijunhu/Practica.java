
package com.tiernoparla.practica1zijunhu;

    import java.util.*;

public class Practica {
    public static void main(String[] args) {
     
    //PARTE 1
    
    //introducir número
    Scanner sca = new Scanner(System.in);

    System.out.println("Introduce tu numero que quiere: ");
    
    int num = sca.nextInt();

    System.out.println("numero que tengo son: " + num);
    
    //generar el número al 0 y 1
    Random ram = new Random();
    
    for (int i = 0; i < num; i++) {
      int dado = ram.nextInt(2);
      System.out.print(dado + " ");
    }
    
        System.out.println(" ");
    
     
    //PARTE 2
    for (int j = 1; j < num; j++) {
        int elevado = (int) Math.pow(2, j)-(j+1);
        System.out.println("2elevado a " + j + " = " + elevado);
        for (int k = 0; k >= num; k++ ) {
            System.out.println("porfa" + k);
    }
    }
    
    
        
        
        
        
        
        
        
        
    } //main
} //Practica
