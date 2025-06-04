package logica;

import java.util.Scanner;

public class PiedraPapelTijera {
        public static void iniciar() {

        int opcionUsuario, opcionCompu;
		int victoriasUsuario, victoriasCompu, empates;
		String salir;
        Scanner tecladoInt = new Scanner(System.in);
        Scanner tecladoString = new Scanner(System.in);
        
        victoriasUsuario = 0;
        victoriasCompu = 0;
        empates = 0;
        
        System.out.println("*****************************************");
        System.out.println("Juego Piedra, Papel o Tijera");
        System.out.println("-----------------------------------------");
        
        do {
	        opcionCompu = (int)Math.floor(Math.random()*3+1);
	        	        
	        
	        System.out.println("Elija 1-Piedra 2-Papel 3-Tijera");
	        opcionUsuario = tecladoInt.nextInt();
	        
	        if (opcionCompu == opcionUsuario){
	        	System.out.println("Usuario: " + opcionUsuario);
	        	System.out.println("Computadora: " + opcionCompu);
	            System.out.println("Empate");
	            System.out.println("*****************************************");
	            empates = empates + 1;
	        }
	        else if (opcionCompu == 1 && opcionUsuario == 3 || opcionCompu == 2 && opcionUsuario == 1 || opcionCompu == 3 && opcionUsuario == 2) {
	        	System.out.println("Usuario: " + opcionUsuario);
	        	System.out.println("Computadora: " + opcionCompu);
	            System.out.println("Ganó Compu");
	            System.out.println("-----------------------------------------");
	            victoriasCompu = victoriasCompu + 1;
	        } else {
	        	System.out.println("Usuario: " + opcionUsuario);
	        	System.out.println("Computadora: " + opcionCompu);
	            System.out.println("Ganó Usuario");
	            System.out.println("#########################################");
	            victoriasUsuario = victoriasUsuario + 1;
	        }
	        
	        System.out.println("Desea salir (SI/NO)?");
	        salir = tecladoString.nextLine().toUpperCase();
	        
        } while (!salir.equals("SI"));
        
        System.out.println("*****************************************");
        System.out.println("Victorias Usuario: " + victoriasUsuario);
        System.out.println("Victorias Computadora: " + victoriasCompu);
        System.out.println("Empates: " + empates);
        System.out.println("*****************************************");
	if (victoriasUsuario > victoriasCompu){
            System.out.println("GANADOR USUARIO!!!");
        } if (victoriasCompu > victoriasUsuario){
            System.out.println("PERDISTE - TE GANO LA COMPU!!!");
            System.out.println("INTENTALO NUEVAMENTE");
        }
    }

    
}
