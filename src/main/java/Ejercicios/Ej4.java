package Ejercicios;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        String frase;
        int opcion;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca un frase de no mas de 80 caracteres: ");
            frase = sc.nextLine();
            System.out.println("Teclea el numero 1 si quieres la frase en MAYUSCULAS o el numero 2 si quieres "
                    + "la frase en MINUSCULAS: ");
            opcion = sc.nextInt();
            
            
        }while(frase.length()>80 );
        
        switch (opcion) {
            case 1:
                System.out.println(frase.toUpperCase());
                break;
            case 2:
                System.out.println(frase.toLowerCase());
                break;
            default:
                System.out.println("No has introducido una opcion valida.");;
        }
    }  
}
