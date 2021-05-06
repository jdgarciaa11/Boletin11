package EJ4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Fichero {
    private String nombre;
    private String tipo;
    private long tamanio;
    private LocalDate ultimaModificacion;

    public Fichero(String nombre, String tipo, long tamanio, long ultimaModificacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.ultimaModificacion = conversor(ultimaModificacion);
    }

    private LocalDate conversor(long fechaLong){
        LocalDate fecha = LocalDate.now();
        SimpleDateFormat formatoSimple = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter formatoXano = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return fecha;
    }

    @Override
    public String toString() {
        return "\n"+ tipo +
                "\nNombre = " + nombre +
                "\n" + ultimaModificacion +
                "\nTamaño=" + tamanio;
    }
}
