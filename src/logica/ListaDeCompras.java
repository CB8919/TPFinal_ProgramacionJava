package logica;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ListaDeCompras {
    public static ArrayList<String> agregar(ArrayList<String> lista) {
        String producto;
        Scanner tecladoString = new Scanner(System.in);

        System.out.println("Agrega productos a tu lista");
        System.out.println("Escribe SALIR para terminar");
        do {
            System.out.print("Producto: ");
            producto = tecladoString.nextLine().toUpperCase();

            if (!producto.equals("SALIR")) {
                if (lista.contains(producto)) {
                    System.out.println("Este item ya existe en la lista");
                } else {
                    lista.add(producto);
                }
            }

        } while (!producto.equals("SALIR"));

        return lista;
    }

    public static void mostrar(ArrayList<String> listaCompras) {
        Collections.sort(listaCompras);
        System.out.println("****Lista de Compras****");
        
        for (String elemento : listaCompras) {
            System.out.println("- " + elemento);
        }
    }

                                              
    public static ArrayList<String> modificar(ArrayList<String> lista) {
        String producto, nuevoProducto;
        Scanner tecladoString = new Scanner(System.in);
        int indice;

        mostrar(lista);
        System.out.println("Qué producto quieres modificar?");
        producto = tecladoString.nextLine().toUpperCase();

        if (lista.contains(producto)) {
            System.out.println("Escribe el nuevo producto");
            nuevoProducto = tecladoString.nextLine().toUpperCase();

            indice = lista.indexOf(producto);
            lista.set(indice, nuevoProducto);

        } 
        else {
            System.out.println("Ese producto no está en la lista");
        }

        return lista;
    }
    
    public static ArrayList<String> eliminar(ArrayList<String> lista) {
        String producto;
        Scanner tecladoString = new Scanner(System.in);
        int indice;
        
        mostrar(lista);
        System.out.println("Qué producto quieres eliminar?");
        producto = tecladoString.nextLine().toUpperCase();
        
        if (lista.contains(producto)) {
            lista.remove(producto);
        } 
        else {
            System.out.println("Ese producto no está en la lista");
        }
        
        return lista;
    }
    
    static void guardarArchivo(ArrayList<String> lista) {
	FileWriter archivo = null;  
	String rutaArchivo = "C:\\Users\\Noxie\\Documents\\NetBeansProjects\\HolaMundo\\src\\logica\\listaCompras.txt";
	try {
		archivo = new FileWriter(rutaArchivo);
		
		for (String item : lista) {
			archivo.write(item + "\n");
		}
		System.out.println("Los datos se guardaron correctamente");
		archivo.close();
	} catch (Exception error) {
		System.out.println("Mensaje de la excepción: " + error.getMessage());
}
}
    
    static ArrayList<String> leerArchivo(ArrayList<String> lista) {
        String rutaArchivo = "C:\\Users\\Noxie\\Documents\\NetBeansProjects\\HolaMundo\\src\\logica\\listaCompras.txt";
        File archivo = new File(rutaArchivo);
        Scanner contenidoArchivo = null;
        String linea;
        
        try {
            
            contenidoArchivo = new Scanner(archivo);
            while (contenidoArchivo.hasNextLine()) {
                linea = contenidoArchivo.nextLine();
                lista.add(linea);
            }
            contenidoArchivo.close();
            } catch (Exception exContenido) { 
            System.out.println("Mensaje: " + exContenido.getMessage());
            }
        return lista;
            
    }

    public static void iniciar(){
        
        ArrayList<String> listaCompras = new ArrayList<>(); 
        int opcionUsuario;
        Scanner tecladoInt = new Scanner(System.in);
        
        System.out.println("_____BIENVENIDO!!!_____");
        System.out.println();
        

        System.out.println("****Lista de Compras****");
        listaCompras = leerArchivo(listaCompras);
                

        do {
            System.out.println("Elige una opción");
            System.out.println("1-Agregar 2-Modificar 3-Eliminar 4-Mostrar 5-Guardar 6-Salir");
            opcionUsuario = tecladoInt.nextInt();

            switch (opcionUsuario) {
                case 1:
                    
                    
                    listaCompras = agregar(listaCompras);
                    mostrar(listaCompras);
                    break;
                case 2:
                    listaCompras = modificar(listaCompras);
                    mostrar(listaCompras);
                    break;
                case 3:
                    listaCompras = eliminar(listaCompras);
                    eliminar(listaCompras);
                    break;
                case 4:
                    mostrar(listaCompras);
                case 5:
                    guardarArchivo(listaCompras);
                    break;
                case 6:
                    System.out.println("USTED SALIO DE LA LISTA");
                    guardarArchivo(listaCompras);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcionUsuario != 6);

    }
}
