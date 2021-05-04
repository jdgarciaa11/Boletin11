package EJ2b;

import java.io.File;
import java.text.SimpleDateFormat;

public class Main {
    //EJERCICIO 2b.- Si no lo has tenido en cuenta, valida la entrada del programa para comprobar
    //que exista el fichero
    public static void main(String[] args) {
        File jesus = new File("C:\\Users\\jgarcia\\Desktop\\LM");
        File[] carpeta = jesus.listFiles();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        if (carpeta == null || carpeta.length == 0) {
//            System.out.println("No hay elementos dentro de la carpeta actual");
//            return;
//        } else {
//            for (int i = 0; i < carpeta.length; i++){
//                File archivo = carpeta[i];
//                System.out.println("Archivo ["+i+"]");
//                System.out.println("Nombre: "+archivo.getName());
//                System.out.println(archivo.isDirectory() ? "Es una carpeta" : "Es un archivo");
//                System.out.println("Peso: "+archivo.length());
//                System.out.println(formato.format(archivo.lastModified()));
//                System.out.println();
//            }
//        }

        //OR

        if (jesus.exists()){
            for (int i = 0; i < carpeta.length; i++){
                File archivo = carpeta[i];
                System.out.println("Archivo ["+i+"]");
                System.out.println("Nombre: "+archivo.getName());
                System.out.println(archivo.isDirectory() ? "Es una carpeta" : "Es un archivo");
                System.out.println("Peso: "+archivo.length());
                System.out.println(formato.format(archivo.lastModified()));
                System.out.println();
            }
        } else {
            System.out.println("No existe mi ciela");
        }
    }
}
