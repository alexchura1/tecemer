package E4;

import java.util.ArrayList;

public class Laboratorio {
    private String identificacion;
    private String instructor;
    private String horario;
    private int numEquipos;
    private ArrayList<Estudiante> estudiantesAsignados;

    public Laboratorio(String identificacion, String instructor, String horario, int numEquipos) {
        this.identificacion = identificacion;
        this.instructor = instructor;
        this.horario = horario;
        this.numEquipos = numEquipos;
        this.estudiantesAsignados = new ArrayList<Estudiante>();
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

    public ArrayList<Estudiante> getEstudiantesAsignados() {
        return estudiantesAsignados;
    }

    public boolean hayCuposDisponibles() {
        return estudiantesAsignados.size() < numEquipos;
    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        if (hayCuposDisponibles() && !estudiantesAsignados.contains(estudiante)) {
            estudiantesAsignados.add(estudiante);
            return true;
        }
        return false;
    }

    public boolean quitarEstudiante(Estudiante estudiante) {
        if (estudiantesAsignados.contains(estudiante)) {
            estudiantesAsignados.remove(estudiante);
            return true;
        }
        return false;
    }
}
