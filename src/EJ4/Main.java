package EJ4;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //EJERCICIO 4.- Modifica el ejercicio anterior devolviendo un array de objetos que contengan el
    //nombre de un fichero o carpeta dentro de la ruta recibida, si es un fichero o un directorio, la fecha
    //de modificación, si es oculto y su tamaño (sólo ficheros).
    public static void main(String[] args) {
        System.out.println(muestraContenido("C:\\Users\\jesus"));
    }

    public static List muestraContenido(String ruta) {
        File path = new File(ruta);
        File[] carpeta = path.listFiles();
        List listaArchivo = new ArrayList();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        if (path.exists()) {
            for (int i = 0; i < carpeta.length; i++) {
                File archivo = carpeta[i];
                Fichero fichero = new Fichero(archivo.getName(), archivo.isDirectory() ? "Carpeta" : "\nArchivo", archivo.length(), format.format(archivo.lastModified()));
                listaArchivo.add(fichero);
            }
        } else {
            listaArchivo.add("No existe");
        }
        return listaArchivo;
    }
}
