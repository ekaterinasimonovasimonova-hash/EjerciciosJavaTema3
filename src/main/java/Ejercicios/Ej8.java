package Ejercicios;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        String frase;
        int num;
        char letra;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Introduzca una frase corta: ");
        frase = sc.nextLine();
        frase = frase.toUpperCase();
        
        do{
            System.out.println("Introduzca un numero del 1 al 10");
            num = sc.nextInt();
        }while(num<1 || num>10);
        
        for (int i = 0; i < frase.length(); i++) {
            
            letra = frase.charAt(i);
            
            if(letra>= 'A' && letra<='Z'){

            }
        }   
    }
}
