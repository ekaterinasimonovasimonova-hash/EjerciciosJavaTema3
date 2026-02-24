package Ejercicios;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {

        String palabra;
        String nuevaPalabra;
        int longitud = 20;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca una palabra de no mas de 20 caracteres: ");
            palabra = sc.nextLine();
                    
        }while(palabra.length()>longitud);
        
        for (int i = 0; i < palabra.length(); i++) {
            
            nuevaPalabra = (palabra.charAt(palabra.length()-1))+(palabra.substring(0, palabra.length()-1));
            palabra = nuevaPalabra;
            System.out.println(nuevaPalabra);
        }
    }
}
