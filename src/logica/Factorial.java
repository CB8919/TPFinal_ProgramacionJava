package logica;
import java.util.Scanner;
public class Factorial {
    public static void iniciar() {
		
		int numero, factorial;
                String salir;
		Scanner tecladoInt = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		factorial = 1;
		
                System.out.println("BIENVENIDOS A FACTORIAL!!!");
                System.out.println();
		do{
                System.out.print("Ingrese un número entero entre 1 y 10, para obtener su Factorial: ");
		numero = tecladoInt.nextInt();
		if (numero >=1 && numero <= 10){
                for(int c = 1; c <= numero; c++) {
			factorial = factorial * c; 
		}
                    System.out.println("El factorial de " + numero + " es: " + factorial);
                }else {
                    System.out.println("Ingrese un número entre 1 y 10 por favor");
                }
                System.out.println("Desea Salir? SI/NO");
                    salir = tecladoString.nextLine().toUpperCase();
		}while (!salir.equals("SI"));
	}

}
