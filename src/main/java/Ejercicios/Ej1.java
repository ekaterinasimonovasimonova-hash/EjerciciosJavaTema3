package Ejercicios;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        int longitud = 80;
        String frase;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca un frase de maximo 80 caracteres: ");
            frase = sc.nextLine();
            
        }while(frase.length()>80 );
        
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.substring(0,i+1));
        }
    }
}
