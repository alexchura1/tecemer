package E2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RelojDigital {
    private LocalTime horaActual;

    public RelojDigital() {
        this.horaActual = LocalTime.now();
    }

    public void setHoraActual(LocalTime hora) {
        this.horaActual = hora;
    }

    public LocalTime getHoraActual() {
        return this.horaActual;
    }

    public String mostrarHora() {
        // Crear un objeto DateTimeFormatter para formatear la hora
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        // Formatear la hora en el formato deseado
        String horaFormateada = this.horaActual.format(formatoHora);

        // Devolver la hora formateada
        return horaFormateada;
    }
}