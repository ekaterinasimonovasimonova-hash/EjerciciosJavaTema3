package Ejercicios;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {

        String frase;
        Scanner sc = new Scanner(System.in);
        int vocales = 0;
        int consonantes = 0;
        int numeros = 0;
        
        do{
            System.out.println("Introduzca un frase de no mas de 80 caracteres: ");
            frase = sc.nextLine();
            
        }while(frase.length()>80 ); 
        
        for (int i = 0; i < frase.length(); i++) {
            
            char letra = frase.charAt(i);
            
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                vocales++;
            }else if(letra>= '0' && letra<= '9'){
                numeros++;
            }else{
                consonantes++;
            }
        }
        System.out.println("La frase tiene: "+vocales+" vocales,"
                + " "+consonantes+" consonantes y "+numeros+" numeros.");
    }
}
