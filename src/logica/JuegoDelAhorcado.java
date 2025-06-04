package logica;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class JuegoDelAhorcado {
        static String obtenerPalabra() { 
        
        String rutaArchivo = "C:\\Users\\Noxie\\Documents\\NetBeansProjects\\HolaMundo\\src\\logica\\listaPalabras.txt";
        File archivo = new File(rutaArchivo);
        Scanner contenidoArchivo = null;
        String palabra = "";
        ArrayList<String> listaPalabras = new ArrayList<>();
        int indiceAlAzar;

        
        try {
            System.out.println("### QUE COMIENCE EL JUEGO!!! ###");
            contenidoArchivo = new Scanner(archivo);
            
            while (contenidoArchivo.hasNextLine()) {
                String linea = contenidoArchivo.nextLine();
                listaPalabras.add(linea);
            }

            
            indiceAlAzar = (int) (Math.random() * listaPalabras.size());

            
            palabra = listaPalabras.get(indiceAlAzar);
            contenidoArchivo.close();
        } catch (Exception excepcionContenido) {
            System.out.println("Error: No se encontró el archivo");
        }

        return palabra;
    }

    static ArrayList<Integer> buscarLetra(char letra, String palabra) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < palabra.length(); i++) {
            if (letra == palabra.charAt(i)) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static void iniciar() {
        String palabra;
        char letra;
        int intentos;
        Scanner ingresoLetra = new Scanner(System.in);
        ArrayList<Integer> indices = new ArrayList<>();
        ArrayList<Character> palabraAdivinando = new ArrayList<>();
        String jugarOtraVez = "";
        Scanner tecladoString = new Scanner(System.in);

        do {
           
            palabra = obtenerPalabra();
            if (palabra.equals("")) {
                continue;
            }
            
            for (int i = 0; i < palabra.length(); i++) {
                System.out.print("-");
                palabraAdivinando.add('-');
            }

           
            intentos = palabra.length() + 5;

            
            do {
                System.out.println("");
                System.out.println("Ingrese una letra");
                letra = ingresoLetra.next().charAt(0);
                String palabraAdivinada = "";

                indices = buscarLetra(letra, palabra);  
                
                for (int i = 0; i < indices.size(); i++) {
                    palabraAdivinando.set(indices.get(i), letra);
                }
                
                System.out.println();
                System.out.println(palabraAdivinando);

                
                for (int i = 0; i < palabraAdivinando.size(); i++) {
                    palabraAdivinada = palabraAdivinada + palabraAdivinando.get(i);
                }
                System.out.println();
                System.out.println(palabraAdivinada);
                

                if (palabraAdivinada.equals(palabra)) {
                    System.out.println("Adivinaste!!!!");
                    break;
                }
                System.out.println("──────────────────────────────");
                intentos--;
                
                System.out.println("Te quedan " + intentos + " intentos");

            } while (intentos > 0);

            
            if (intentos == 0) {
                
                System.out.println("Ahorcado....  (×_×)");
            }

            
            System.out.println("La palabra era: " + palabra);

            System.out.println("Quieres jugar otra vez? (SI/NO)");
            jugarOtraVez = tecladoString.nextLine().toUpperCase();
            
            
            if(jugarOtraVez.equals("SI")){
                palabraAdivinando.clear();
                indices.clear();
            }
            
        } while (jugarOtraVez.equals("SI"));
        
        System.out.println("*** VUELVE PRONTO!!! ***");
    }
}
