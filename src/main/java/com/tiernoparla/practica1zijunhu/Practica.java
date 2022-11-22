
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
    
    //2n-(n+1)
    int n = 5;
    int cal = (int) Math.pow(2, n);
    int calculo = cal-(n+1);
        System.out.println(calculo);
    } //main
} //Practica
