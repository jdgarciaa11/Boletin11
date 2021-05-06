package EJE8;

import java.util.Scanner;

public class Main {
    //EJERCICIO 8.- Diseña un programa con contraseña, que será suministrada desde la línea de
    //comandos junto con la ruta de un archivo de texto. Del archivo debes corregir las palabras que
    //deben empezar por mayúsculas.
    public static Scanner scan = new Scanner(System.in);
    private static final String CONTRASENIA = "jamon123";
    public static void main(String[] args) {
        String contrasenia;
        String ruta;
        boolean salir = false;
        int count = 0;
        do {
            System.out.print("Introduzca la contraseña: ");
            contrasenia = scan.nextLine();
            if (contrasenia.equals(CONTRASENIA)){
                System.out.print("Introduzca una ruta: ");
                ruta = scan.nextLine();
                corregirMayusculas(ruta);
                salir = true;
            } else if (count == 3){
                System.out.println("Ya no te quedan intentos");
                salir = true;
            } else {
                count++;
            }
        } while (salir);


    }
    public static void corregirMayusculas(String path){

    }
}
