package Ejercicios;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        String frase;
        Scanner sc = new Scanner(System.in);
        String frasePar = "";
        String fraseImpar = "";
        
        do{
            System.out.println("Introduzca un frase de no mas de 80 caracteres: ");
            frase = sc.nextLine();
            
        }while(frase.length()>80 );
        
        for (int i = 0; i < frase.length(); i++) {
            
            if(i%2==0){
                frasePar = frasePar + frase.charAt(i);
            }else{
                fraseImpar = fraseImpar + frase.charAt(i);
                
            }
        }
        System.out.println(frasePar);
        System.out.println(fraseImpar);
    } 
}
