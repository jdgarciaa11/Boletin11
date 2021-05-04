package EJ4;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public static List muestraContenido(String ruta){
        File path = new File(ruta);
        File[] carpeta = path.listFiles();
        List listaArchivo = new ArrayList();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if (path.exists()){
            for (int i = 0; i < carpeta.length; i++){
                File archivo = carpeta[i];
                String cosas = "Archivo ["+i+"]" +
                        "\nNombre: " + archivo.getName() +
                        (archivo.isDirectory() ? "\nEs una carpeta" : "\nEs un archivo")+
                        "\nPeso: "+archivo.length() + "\n" + formato.format(archivo.lastModified()) + "\n";
                listaArchivo.add(cosas);
            }
        } else {
            listaArchivo.add("No existe");
        }
        return listaArchivo;
    }
}
