package EJ5;

import java.io.*;
import java.util.Scanner;

public class Main {
    //EJERCICIO 5.- Realiza un programa para crear un fichero de texto que contenga las cadenas de
    //caracteres suministradas desde la línea de comandos, una en cada línea del fichero de texto.
    //Escritura en txt es decir, no se utiliza la clase buffer que es para binarios, si no el paquete .io.* para este ejercicio
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //SE DECLARA LAS VARIABLES QUE VAMOS A UTILIZAR EN NULL
        File fichero = new File("C:\\Users\\jesus\\IdeaProjects\\Boletin11\\src\\EJ5\\EJE5.txt");
        FileWriter ficheroEscritura = null;
        PrintWriter escritura = null;
        if (fichero.exists()) {
            try {
                //DENTRO DEL TRY, SE INICIALIZAN LAS VARIABLES PARA CAPTURAR LAS EXCEPCIONES QUE LANZAN ALGUNAS VARIABLES
                ficheroEscritura = new FileWriter(fichero);
                escritura = new PrintWriter(ficheroEscritura);
                boolean salir = false;
                for (int i = 0; i < 10; i++) { //TODO -> PORQUE NO ME DEJA HACER UN DO WHILE :(
                    escritura.println(pedirCadena());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    // Nuevamente aprovechamos el finally para asegurarnos que se cierra el fichero.
                    if (null != ficheroEscritura) {
                        ficheroEscritura.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private static String pedirCadena() {
        String cadena;
        System.out.print("Introduzca una cadena de caracteres o S para salir: ");
        return cadena = scan.nextLine();
    }
}
