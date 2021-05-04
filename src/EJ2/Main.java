package EJ2;

import java.io.File;
import java.text.SimpleDateFormat;

public class Main {
    //EJERCICIO 2.- Usa los métodos File para indicar las propiedades y listar el contenido de un
    //archivo cuyo nombre será suministrado por el usuario.
    public static void main(String[] args) {
        File jesus = new File("C:\\Users\\jgarcia\\Desktop\\LM");
        File[] carpeta = jesus.listFiles();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (int i = 0; i < carpeta.length; i++){
            File archivo = carpeta[i];
            System.out.println("Archivo ["+i+"]");
            System.out.println("Nombre: "+archivo.getName());
            System.out.println(archivo.isDirectory() ? "Es una carpeta" : "Es un archivo");
            System.out.println("Peso: "+archivo.length());
            System.out.println(formato.format(archivo.lastModified()));
            System.out.println();
        }
    }
}
