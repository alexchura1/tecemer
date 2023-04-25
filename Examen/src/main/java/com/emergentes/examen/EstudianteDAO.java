package com.emergentes.examen;

import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    private static List<Estudiante> listaEstudiantes = new ArrayList<>();
    private static int ultimoId = 0;

    public static void agregarEstudiante(Estudiante estudiante) {
        ultimoId++;
        estudiante.setId(ultimoId);
        listaEstudiantes.add(estudiante);
    }

    public static void actualizarEstudiante(Estudiante estudiante) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante est = listaEstudiantes.get(i);
            if (est.getId() == estudiante.getId()) {
                listaEstudiantes.set(i, estudiante);
                break;
            }
        }
    }

    public static void eliminarEstudiante(int id) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante est = listaEstudiantes.get(i);
            if (est.getId() == id) {
                listaEstudiantes.remove(i);
                break;
            }
        }
    }

    public static List<Estudiante> obtenerEstudiantes() {
        return listaEstudiantes;
    }

    public static Estudiante obtenerEstudiante(int id) {
        for (Estudiante est : listaEstudiantes) {
            if (est.getId() == id) {
                return est;
            }
        }
        return null;
    }
}
