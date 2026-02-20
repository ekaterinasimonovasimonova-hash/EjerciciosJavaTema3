package Ejercicios;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        String frase;
        String palabra;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca un frase de no mas de 80 caracteres: ");
            frase = sc.nextLine();
            System.out.println("Introduzca una palabra: ");
            palabra = sc.nextLine();
            
        }while(frase.length()>80 );
        
        for (int i = 0; i < frase.length(); i++) {
            
        }
        if(frase.indexOf(palabra)!= -1){
            System.out.println("La frase contiene la palabra.");
        }else{
            System.out.println("La frase no contiene la palabra.");
        }
    } 
}
