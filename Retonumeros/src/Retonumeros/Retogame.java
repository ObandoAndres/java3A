package Retonumeros;

import java.util.Scanner;

public class Retogame {
    
    public static void main(String[] args) {
        
        int ran=0,bool=1,opc=0,pos=0,z=1,dado1=0,dado2,bol=0;
        while(bool==1){
            Scanner cant = new Scanner(System.in);
            Scanner r = new Scanner(System.in);
            System.out.println(":::: Cuantos jugadores desean jugar ?? :::: ");
            ran = cant.nextInt();
            if(ran>=2 && ran<=4){
               System.out.println("::Elija su dificultad::");
               System.out.println("(1.) __Nivel Basico__");  
               System.out.println("(2.) __Nivel Intermedio__");
               System.out.println("(3.) __Nivel Avanzado__");
               System.out.println("Por favor escoja una opcion (1, 2 o 3)");
               opc = cant.nextInt();
               switch(opc){
                   case 1 :
                       int j[] = {1,2,3,4,5};
                       int k[] = {0,0,0,0,0};
                       int l[] = {0,0,0,0,0};
                       pos=20;
                       System.out.println("::Usted ha elegido el nivel basico::");
                       while(bol==0){
                       for(z=1;z<=ran;z++){
                         System.out.println(""); 
                         System.out.println(" Turno Player : "+z);
                         System.out.println("Presione enter para tirar los dados : ");
                         r.nextLine();
                         dado1 =((int)(Math.random()*(6-1+1)+1));
                         dado2 =((int)(Math.random()*(6-1+1)+1));
                         j[z] = dado1 + dado2;
                         
                         if (dado1==dado2){
                         l[z] = l[z]+1;
                         } 
                         k[z] = k[z]+j[z];
                         
                         System.out.println("Dado1: "+dado1+" Dado2: "+dado2+" TOTAL : "+j[z]);
                         System.out.println(" Player 1:__ "+k[1]+" __ Player 2: "+k[2]+" __ Player 3 : "+k[3]+" __ Player 4: "+k[4]);
                         if(k[z]>=pos || l[z]==3){
                          System.out.println("El ganador es el PLAYER: "+z);
                          z=6;
                          bol=1;
                         }else if (k[1]<pos || k[2]<pos || k[3]<pos || k[4]<pos){
                         bol=0;  
                         }
                         
                         }
                         
                        if(z==ran){
                          z=0;
                         }
                        }
                        

                        bool=0;
                        break;
                    case 2 :
                       int j2[] = {1,2,3,4,5};
                       int k2[] = {0,0,0,0,0};
                       int l2[] = {0,0,0,0,0};
                       pos=30;
                       System.out.println("::Usted ha elegido el nivel intermedio::");
                       while(bol==0){
                       for(z=1;z<=ran;z++){
                         System.out.println(""); 
                         System.out.println("Turno Player: "+z);
                         System.out.println("Presione enter para tirar los dados : ");
                         r.nextLine();
                         dado1 =((int)(Math.random()*(6-1+1)+1));
                         dado2 =((int)(Math.random()*(6-1+1)+1));
                         j2[z] = dado1 + dado2;
                       
                         if (dado1==dado2){
                         l2[z] = l2[z]+1;
                         } 
                       
                         System.out.println("Dado1: "+dado1+" Dado2: "+dado2+" TOTAL : "+j2[z]);
                         System.out.println(" Player 1: "+k2[1]+" __ Player 2: "+k2[2]+" __ Player 3: "+k2[3]+" __ Player 4: "+k2[4]);
                         if(k2[z]>=pos || l2[z]==3){
                         System.out.println("El ganador es el PLAYER: "+z);
                          z=6;
                          bol=1;
                         }else if (k2[1]<pos || k2[2]<pos || k2[3]<pos || k2[4]<pos){
                         bol=0;  
                         }
                         }
                         
                        if(z==ran){
                          z=0;
                         }
                        }
                        

                        bool=0;
                        break;
                    case 3 :
                       int j3[] = {1,2,3,4,5};
                       int k3[] = {0,0,0,0,0};
                       int l3[] = {0,0,0,0,0};
                       pos=50;
                       System.out.println("::Usted ha elegido el nivel::");
                       while(bol==0){
                       for(z=1;z<=ran;z++){
                         System.out.println(""); 
                         System.out.println("Turno Player: "+z);
                         System.out.println("Presione enter para tirar los dados : ");
                         r.nextLine();
                         dado1 =((int)(Math.random()*(6-1+1)+1));
                         dado2 =((int)(Math.random()*(6-1+1)+1));
                         j3[z] = dado1 + dado2;
                       
                         if (dado1==dado2){
                         l3[z] = l3[z]+1;
                         } 
                         k3[z] = k3[z]+j3[z];
                         
                         System.out.println("Dado1: "+dado1+" Dado2: "+dado2+" TOTAL : "+j3[z]);
                         System.out.println(" Player 1: "+k3[1]+" __ Player 2: "+k3[2]+" __ Player 3: "+k3[3]+" __ Player 4: "+k3[4]);
                         if(k3[z]>=pos || l3[z]==3){
                          System.out.println("El ganador es el PLAYER: "+z);
                          z=6;
                          bol=1;
                         }else if (k3[1]<pos || k3[2]<pos || k3[3]<pos || k3[4]<pos){
                         bol=0;  
                         }
                         }
                         
                        if(z==ran){
                          z=0;
                         }
                        }
                        bool=0;
                        break;
                        
                   default :
                       System.out.println("Error numero invalido");
                       System.out.println("");
                       bool=1;
                       break;
               }
            }
            else{
              bool = 1;
              System.out.println("::No se puede jugar individual::");
              System.out.println("--------------------"); 
            }
               
    }
    
}
}