package logica;

import java.util.Scanner;

public class NumeroParImpar {
    public static void iniciar() {
        int numeroUsuario, contador, suma;
        Scanner tecladoInt = new Scanner(System.in);
        
        System.out.println("Hola nuevamente!!!");
        System.out.println("Usted a elejido la opción número Par e Impar ");
        System.out.println("Ingrese un numero entero, luego la computadora le dira si ese numero es Par o Impar");
        numeroUsuario = tecladoInt.nextInt();
        
        contador = 1;
        suma = 0;
       
        
            if (numeroUsuario % 2 == 0){
                System.out.println("El número: " + numeroUsuario + " es Par");
                
                
            } 
            
            else {
                System.out.println("El número: " + numeroUsuario + " es Impar");
            }
            
            
        
        
        
    }
}
