/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto.pkg1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x =0;
        
     Scanner entradadatos = new Scanner(System.in);
        
     System.out.println("Ingrese la cantidad de numeros con los que desea trabajar::");
        
     int w = entradadatos.nextInt();
     int vector[] = new int [w] ;
        
     for (int f = 1; f <= w; f++){
        System.out.println("ingresar valores::");
        x = entradadatos.nextInt();
        vector[f-1] = x ;
        if(f >=3){
        int z = vector[f-2] +  vector[f-3];
         if (z==vector[f-1]){
                 System.out.println(":::__________:::");
                 System.out.println(    ":::No cumple con la condicion:::");
                 f--;
                }
            }else if(f == w){
        }
      }
    }
    
}
