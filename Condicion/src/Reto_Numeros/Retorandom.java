package Reto_Numeros;
import java.util.Scanner;
import java.util.Random;

public class Retorandom {
    
    public static void main(String[] args) {
    int x=0,y=0,z=0,n=0,p=0,na=0,npp=0,npn=0,nin=0,nip=0,sp=0;
        
         
        while(p==0){
         Scanner l = new Scanner(System.in);
         System.out.println("Valores aleatorios a generar: ");
         x = l.nextInt();
         System.out.println("Rango inferior: ");
         y = l.nextInt();
         System.out.println("Rango superior: ");
         z = l.nextInt();
         if(y<z){
           System.out.println("Los numeros son: ");
           for(int i = 1; i<=x; i++){
  
             n=((int)(Math.random()*(z-y+1)+y));
             System.out.println("El numero: "+n);
             if(n==0){
              na++;
             }else if(n%2==0){
                if(n>0){
                   npp++;
                  }else{
                   npn++;
                   sp=sp+n;
                  }
             }else{
                if(n>0){
                   nip++;
                  }else{
                   nin++;
             }   
             }
           }
            System.out.println(":::LOS NUMEROS SON__:");
            System.out.println("");
            System.out.println("Numero de ceros: "+na);
            System.out.println("Pares positivos: "+npp);
            System.out.println("Pares negativos: "+npn);
            System.out.println("Positivos impares: "+nip);
            System.out.println("los nueros negativos impares son: "+nin);
            System.out.println("suma de los nueros negativos pares son: "+sp);
            p=1;
         }
         else
         {
            System.out.println("");
            System.out.println("Error");
            System.out.println("");
            p=0;
         }
         }
        }
    }
