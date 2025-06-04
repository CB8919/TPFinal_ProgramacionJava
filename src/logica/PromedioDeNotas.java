package logica;

import java.util.Scanner;

public class PromedioDeNotas {
        public static void iniciar() {
        int cantidadDeValores, contador, valorIngresado, suma;
        double promedio;
        Scanner tecladoInt = new Scanner(System.in);
        
        contador = 1;
        suma = 0;
        
        System.out.println("Bienvenido!!! Usted selecciono el promedio de notas");
        System.out.println("Cuántas notas quieres promediar? (Número entero)");
        cantidadDeValores = tecladoInt.nextInt(); 
        
        do {
                       
            System.out.print("Ingrese la nota " + contador + ":");
            valorIngresado = tecladoInt.nextInt(); 
            
            suma = suma + valorIngresado; 
            
            
            contador = contador + 1; 
            
        } while (contador <= cantidadDeValores);
        
        promedio = (suma * 1.0) / (cantidadDeValores * 1.0);
        System.out.println("************************************");
        System.out.println("El promedio es: " + promedio);
    }

   
}
