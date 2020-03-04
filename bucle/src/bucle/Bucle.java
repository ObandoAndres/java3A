/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle;

/**
 *
 * @author Estudiantes
 */
public class Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pares = 0 , i = 0; 
        for (i = 1; i <=30; i++){
            System.out.println(i);
            if (i%2==0){
                pares++;
            }
        System.out.println("los pares  son"+ pares );
                    
                    
      
        }
        
    }
}
