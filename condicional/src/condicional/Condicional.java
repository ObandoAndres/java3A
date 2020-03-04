/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional;

/**
 *
 * @author Estudiantes
 */
public class Condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n1=5, n2=6, opc=2, sum,resta,mul,div,res = 0;
       
       
            if(opc==1){
                res=n1+n2;
                System.out.println("La respuesta es :"+ res);
            }else
                if(opc==2){
                    res=n1-n2;
                    System.out.println("La respuesta es :"+ res);
                }  else
                        if(opc==2){
                        res=n1*n2;
                        System.out.println("La respuesta es :"+ res);
                        }    else
                            if (opc==2){
                                res=n1/n2;
                                System.out.println("La respuesta es :"+ res);
                            }    else
                                System.out.println("Opcion incorrecta");
                                                   
                        
                                           
            
    }      
}
