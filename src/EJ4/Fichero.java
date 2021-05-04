package EJ4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Fichero {
    private String nombre;
    private String tipo;
    private long tamanio;
    private LocalDate ultimaModificacion;

    public Fichero(String nombre, String tipo, long tamanio, String ultimaModificacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.ultimaModificacion = LocalDate.parse(ultimaModificacion);
    }

    @Override
    public String toString() {
        return "\nFichero" +
                "\nnombre = " + nombre +
                "\n, tipo = " + tipo +
                "\n, tamaño=" + tamanio;
    }
}
