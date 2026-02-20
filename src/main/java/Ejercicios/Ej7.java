package Ejercicios;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {

        String frase;
        Scanner sc = new Scanner(System.in);
        int mayus = 0;
        int minus = 0;
        int numeros = 0;
        
        do{
            System.out.println("Introduzca un frase de no mas de 80 caracteres: ");
            frase = sc.nextLine();
            
        }while(frase.length()>80 ); 
        
        for (int i = 0; i < frase.length(); i++) {
            
            char letra = frase.charAt(i);
            
            if(letra >= 'A' && letra <= 'Z'){
                mayus++;
            }else if(letra>= 'a' && letra<= 'z'){
                minus++;
            }else{
                numeros++;
            }
        }
        System.out.println("La frase tiene: "+mayus+" mayusculas,"
                + " "+minus+" minusculas y "+numeros+" numeros.");
    }     
}

