/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle_while;
import java.util.Scanner;
public class Bucle_while {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int tabla=0, lim_inicio=0, lim_final=0;int res = 0;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Por favor ingresa el numero a multiplicar");
        tabla= entrada.nextInt();
        System.out.println("Por favor ingresa el rango a multiplicar");
        System.out.println(":::::Ingresa el limite de inicio:::::");
        lim_inicio=entrada.nextInt();
        System.out.println(":::::Ingresa el limite final:::::::::");
        lim_final=entrada.nextInt();
        
        if (lim_inicio>lim_final){
            System.out.println(":El limite de inicio no puede ser mayor al limite final:");
            
            System.out.println(":INGRESE VALORES VALIDOS POR FAVOR:");
       }else{
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
        for (lim_inicio = lim_inicio; lim_inicio <= lim_final; lim_inicio++){
        
        res = tabla * lim_inicio;
        System.out.println(res);
            
        }
                   
    }
    }
    
}
