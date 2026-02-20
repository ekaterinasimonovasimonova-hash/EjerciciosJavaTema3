package Ejercicios;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        
        int mayus = 0;
        int minus = 0;
        String frase;
        char letra;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca un frase de no mas de 80 caracteres: ");
            frase = sc.nextLine();
            
        }while(frase.length()>80 );
        
        for (int i = 0; i < frase.length(); i++) {
            
           letra = frase.charAt(i);
           
           if(letra >= 'A' && letra <= 'Z'){
               mayus++;
           }else{
               minus++;
           }
        }
        System.out.println("La frase tiene "+mayus+ " mayusculas y "+minus+ " minusculas. ");
    }    
}
