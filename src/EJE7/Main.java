package EJE7;

import java.io.*;

public class Main {
    //EJERCICIO 7.- Crea el método copiaFicheroTexto, que toma un fichero de texto y realiza una
    //copia a otro. Las rutas de ambos archivos son recibidas como parámetros.

    public static void main(String[] args) {
        copiarFicheroTexto("C:\\Users\\jesus\\IdeaProjects\\Boletin11\\src\\EJE7\\EJE7.txt", "C:\\Users\\jesus\\IdeaProjects\\Boletin11\\src\\EJE7\\EJE7copia.txt");
    }

    private static void copiarFicheroTexto(String pathOrigen, String pathDestino) {
        File origen = new File(pathOrigen);
        File destino = new File(pathDestino);
        FileReader ficheroLectura = null;
        FileWriter ficheroEscritura = null;
        BufferedReader lecturaBuffer = null;
        PrintWriter escritura = null;
        String linea;
        if (origen.exists() && destino.exists()) {
            try {
                ficheroLectura = new FileReader(origen);
                lecturaBuffer = new BufferedReader(ficheroLectura);
                ficheroEscritura = new FileWriter(destino);
                escritura = new PrintWriter(ficheroEscritura);//todo PORQ NO BUFFERED WRITTER
                while ((linea = lecturaBuffer.readLine()) != null) {
                    escritura.println(linea);
                }
                System.out.println("Completado");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si t0d0 va bien como si salta
                // una excepcion.
                //ORDEN DE CIERRE: PRIMERO DE LAS HIJA Y DESPUES LA PADRE
                try {
                    if (null != ficheroLectura && null != ficheroEscritura) {
                        lecturaBuffer.close();
                        ficheroLectura.close();
                        escritura.close();
                        ficheroEscritura.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            System.out.println("No completado");
        }
    }

    /*
    private static void copiarFicheroTexto(String pathOrigen, String pathDestino){
        File origen = new File(pathOrigen);
        File destino = new File(pathDestino);
        if (origen.exists()) {
            try {
                InputStream in = new FileInputStream(origen);
                OutputStream out = new FileOutputStream(destino);
                // Usamos un buffer para la copia.
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                in.close();
                out.close();
                System.out.println("Completado");
            } catch (IOException ioe) {
                ioe.printStackTrace();
                System.out.println("No completado");
            }
        } else {
            System.out.println("No completado");
        }
    }
    FUENTE: https://codigoxules.org/java-copiar-ficheros-java-io/
     */
}
