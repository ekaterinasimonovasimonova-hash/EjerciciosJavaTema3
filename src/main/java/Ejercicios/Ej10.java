package Ejercicios;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {

        String frase;
        int longitud = 60;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca un frase de no mas de 60 caracteres: ");
            frase = sc.nextLine();
            
        }while(frase.length()>longitud );
        
        frase = frase.toUpperCase();
        
        for (int i = 0; i < frase.length(); i++) {
            
            
        }  
    }
}
