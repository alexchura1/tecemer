package E4;

public class Asignacion {
    private Laboratorio laboratorio;
    private Estudiante estudiante;

    public Asignacion(Laboratorio laboratorio, Estudiante estudiante) {
        this.laboratorio = laboratorio;
        this.estudiante = estudiante;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
