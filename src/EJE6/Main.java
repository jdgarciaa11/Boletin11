package EJE6;

import java.io.*;

public class Main {
    //EJERCICIO 6.- Diseña un programa para realizar unas estadísticas respecto a ficheros de texto.
    //La ruta de un fichero de texto será pasada desde la línea de comando y queremos un listado en
    //pantalla con el número de palabras de ese fichero, el número de párrafos, el número de caracteres,
    //la media de caracteres por palabra y la media de palabras por párrafo.
    public static void main(String[] args) {
        //ENTENDEREMOS QUE CADA PALABRA VA ENTRE ESPACIOS " " o ".", el "." no se cuenta como palabra
        //ENTENDEREMOS QUE CADA PARRAFO VA DETRAS DE UN SALTO DE LINEA -> OSEA LINEA VACIA
        estadisticaFichero("C:\\Users\\jesus\\IdeaProjects\\Boletin11\\src\\EJE6\\EJE6.txt");
    }

    private static void estadisticaFichero(String path) {
        File fichero = new File(path);
        FileReader ficheroLectura = null;
        BufferedReader lecturaBuffer = null;
        int numeroPalabras = 0, numeroParrafos = 1, numeroCaracteres = 0;
        double mediaCaracteresPalabra, mediaPalabrasParrafo;
        String linea;
        if (fichero.exists()) {
            try {
                // Apertura del fichero y creacion de BufferedReader para poder
                // hacer una lectura comoda (disponer del metodo readLine()).
                ficheroLectura = new FileReader(fichero);
                lecturaBuffer = new BufferedReader(ficheroLectura);
                while ((linea = lecturaBuffer.readLine()) != null) {
                    if (linea.equals("")) {
                        numeroParrafos++;
                    } else {
                        for (int i = 0; i < linea.length(); i++) {
                            if (linea.charAt(i) == ' ' || linea.charAt(i) == '.') {
                                numeroPalabras++;
                            } else if (linea.charAt(i) != ' ' || linea.charAt(i) != '.') {
                                numeroCaracteres++;
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si t0d0 va bien como si salta
                // una excepcion.
                try {
                    if (null != ficheroLectura) {
                        ficheroLectura.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        mediaCaracteresPalabra = (double) numeroCaracteres / numeroPalabras;
        mediaPalabrasParrafo = (double) numeroPalabras / numeroParrafos;
        System.out.println("Numero de palabras: " + numeroPalabras);
        System.out.println("Numero de parrafos: " + numeroParrafos);
        System.out.println("Numero de caracteres(sin contar los puntos ni espacios): " + numeroCaracteres);
        System.out.println("Media de caracteres por palabra: " + mediaCaracteresPalabra);
        System.out.println("Media de palabras por parrafo: " + mediaPalabrasParrafo);
    }
}
