package logica;

import java.util.Scanner;
public class MenuPrincipal {
    public static void saludar() {
        String nombre;
        Scanner tecladoString = new Scanner(System.in);

        
        System.out.println("Hola cual es su nombre?");
        nombre = tecladoString.nextLine();
        System.out.println("Saludos " + nombre + " y");

    }

    public static void main(String[] args) {
        int opcionUsuario;
        Scanner tecladoInt = new Scanner(System.in);
        
        System.out.println();
        System.out.println("**********BIENVENIDO AL TRABAJO FINAL DE CODO A CODO INICIAL!!!**********");
        System.out.println();
        
        

        do {
                System.out.println("                    ──────── MIS PROGRAMAS ────────  ");
                System.out.println();
                
                System.out.println("1. Número Par o Impar\n"
                        + "2. Factorial de un número\n"
                        + "3. Promedio de Notas\n"
                        + "4. Juego Piedra, Papel o Tijera\n"
                        + "5. Simulador Cajero Automático\n"
                        + "6. Lista de Compras \n"
                        + "7. Juego Ahorcado \n"
                        + "8. Conversor de Temperaturas \n"
                        + "9. Salir");
                System.out.println();
                System.out.print("Elija una opción y disfute del programa: ");

                try {
                    opcionUsuario = tecladoInt.nextInt();
                } catch (Exception error) {
                    System.out.println("Escribe un número entero. ");
                    opcionUsuario = -1;
                    tecladoInt.next();
                }
                System.out.println();

                switch (opcionUsuario) {
                    case 1:
                        NumeroParImpar.iniciar();
                        break;
                    case 2:
                        Factorial.iniciar();
                        break;
                    case 3:
                        PromedioDeNotas.iniciar();
                        break;
                    case 4:
                        PiedraPapelTijera.iniciar();
                        break;
                    case 5:
                        SimuladorCajeroAutomatico.iniciar();
                        break;
                    case 6:
                        ListaDeCompras.iniciar();
                        break;
                    case 7:
                        JuegoDelAhorcado.iniciar();
                        break;
                    case 8:
                        ConversorTemperatura.iniciar();
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("Invalido");
                        break;
                }

            } while (opcionUsuario != 9);
        
        
        System.out.println("Espero que lo hayas disfrutado!!!");
        System.out.println("### VUELVE PRONTO!!! ###");
        


        
    }
}
