package logica;

import java.util.ArrayList;
import java.util.Scanner;

public class SimuladorCajeroAutomatico {
    static void cliente(ArrayList<String> datosCliente){
        System.out.println("#####################################");
        System.out.println("Datos del Cliente");
        System.out.println("Nombre y Apellido: " + datosCliente.get(0));
        System.out.println("CBU: " + datosCliente.get(1));
        System.out.println("Saldo: $ " + datosCliente.get(2));
        System.out.println("-------------------------------------");
    }
    
    static void saldoActual(ArrayList<String> datosCliente){
        System.out.println("-------------------------------------");
        System.out.println("Su saldo actual es: $" + datosCliente.get(2));
        System.out.println("#####################################");
    }
    
    static void deposito(ArrayList<String> datosCliente){
        int depositoDeDinero;
        String saldo = datosCliente.get(2);
        int saldoActual;
        Scanner tecladoInt = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de dinero que desea a depositar: $ ");
        depositoDeDinero = tecladoInt.nextInt();

        saldoActual = Integer.parseInt(saldo) + depositoDeDinero;

        datosCliente.set(2, Integer.toString(saldoActual));
    }
    
    static void extraccion(ArrayList<String> datosCliente){
        int retiroDeDinero;
        String saldo = datosCliente.get(2);
        int saldoActual;
        
        Scanner tecladoInt = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de dinero que desea retirar: $ ");
        retiroDeDinero = tecladoInt.nextInt();
        
        if (Integer.parseInt(saldo) < retiroDeDinero){
            System.out.println("Exede su limite o no posee saldo suficiente");
            System.out.println("Revise su saldo");
        } else {
            saldoActual = Integer.parseInt(saldo) - retiroDeDinero;

        datosCliente.set(2, Integer.toString(saldoActual));
        }

     }
    
    static void transferencia(ArrayList<String> datosCliente){
        int transferenciaDeDinero;
        String saldo = datosCliente.get(2);
        int cbu ,saldoActual;
        
        Scanner tecladoInt = new Scanner(System.in);
        
        System.out.print("Ingrese el número de CBU a transferir: ");
        cbu = tecladoInt.nextInt();
        
        
        System.out.print("Ingrese la cantidad de dinero que desea transferir: $ ");
        transferenciaDeDinero = tecladoInt.nextInt();
        
        if (Integer.parseInt(saldo) < transferenciaDeDinero){
            System.out.println("Exede su limite o no posee saldo suficiente");
            System.out.println("Revise su saldo");
        } else {
            saldoActual = Integer.parseInt(saldo) - transferenciaDeDinero;

        datosCliente.set(2, Integer.toString(saldoActual));
        }

        
        
    }
    
    public static void iniciar() {

        ArrayList<String> datosCliente = new ArrayList<>();
        int claveUsuario, opcionUsuario;
        double saldo;
        Scanner tecladoInt = new Scanner(System.in);
        
        datosCliente.add("Martin Garcia");
        datosCliente.add("12345678910");
        datosCliente.add("800000");
        

        System.out.println("──────Bienvenido a su Cajero Automático──────");
        System.out.print("Ingrese su tarjeta e ingrese su clave de acceso para comenzar: ");
        claveUsuario = tecladoInt.nextInt();
        
        
        do {
            System.out.println();

            System.out.println("Menu de opciones:\n"
                    + "1-Datos del Cliente\n"
                    + "2-Saldo actual\n"
                    + "3-Realizar Depósito\n"
                    + "4-Realizar Extracción\n"
                    + "5-Realizar Tansferencia\n"
                    + "6-Salir\n");
            opcionUsuario = tecladoInt.nextInt();

            switch (opcionUsuario) {
                case 1:
                    cliente(datosCliente);
                    break;
                case 2:
                    saldoActual(datosCliente);
                    break;
                case 3:
                    deposito(datosCliente);
                    saldoActual(datosCliente);
                    break;
                case 4:
                    extraccion(datosCliente);
                    saldoActual(datosCliente);
                    break;
                case 5:
                    transferencia(datosCliente);
                    saldoActual(datosCliente);
                    break;
                case 6:
                    System.out.println("_____ Adios!!! _____");
                    break;
                default:
                    System.out.println("*** Opción invalida ***");

            }
        } while (opcionUsuario != 6);
        
        
                
        
    }

}
