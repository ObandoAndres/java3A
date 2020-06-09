/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIRI;

import java.util.Random;
import java.util.Scanner;
 
 
public class PIRINOLA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Random N = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        int x = 0, i = 0, contP = 0, acumP = 0, contI = 0, acumI = 0, limit = 0;
        
        //Quantity of numbers to generate
        System.out.println("Please, type a random limit number to generate the list: ");
        limit = keyboard.nextInt();
        
        for(i=1;i<=limit;i++){
            x = (int)(N.nextDouble()* 10 + 1); //Limits: * UpperLimit + LowerLimit
            //System.out.println(x);
            
            if(x % 2 == 0){
                contP = contP + 1; //Counter
                acumP = acumP + x; //Accumulator
                System.out.println(x + "es PAR");
            }else{
                contI = contI + 1; //Counter
                acumI = acumI + x; //Accumulator
                System.out.println(x + "es IMPAR");
            }
        }
        
        
        //Dices
        Random D = new Random();
        int d1 = 0, d2 = 0;
        
        d1 = (int)(D.nextDouble()* 6 + 1);
        d2 = (int)(D.nextDouble()* 6 + 1);
        
        System.out.println("\n\n\n######################################");
        System.out.println("Dice 1: " + d1);
        System.out.println("Dice 2: " + d2);   
        
    } 
}

       
    
    

