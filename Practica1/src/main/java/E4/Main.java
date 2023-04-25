package E4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Laboratorio> laboratorios = new ArrayList<>();
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Asignacion> asignaciones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. Agregar laboratorio");
            System.out.println("2. Agregar estudiante");
            System.out.println("3. Asignar estudiante a laboratorio");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("===== AGREGAR LABORATORIO =====");
                    System.out.print("Identificación: ");
                    String identificacion = scanner.next();
                    System.out.print("Instructor: ");
                    String instructor = scanner.next();
                    System.out.print("Horario: ");
                    String horario = scanner.next();
                    System.out.print("Cupo: ");
                    int numEquipos = scanner.nextInt();
                    laboratorios.add(new Laboratorio(identificacion, instructor, horario, numEquipos));
                    System.out.println("Laboratorio agregado correctamente.");
                    break;

                case 2:
                    System.out.println("===== AGREGAR ESTUDIANTE =====");
                    System.out.print("Código: ");
                    String codigo = scanner.next();
                    System.out.print("Nombre completo: ");
                    scanner.nextLine(); // Consumir el salto de línea que queda en el buffer
                    String nombreCompleto = scanner.nextLine();
                    estudiantes.add(new Estudiante(codigo, nombreCompleto));
                    System.out.println("Estudiante agregado correctamente.");
                    break;

                case 3:
                    System.out.println("===== ASIGNAR ESTUDIANTE A LABORATORIO =====");
                    System.out.print("Ingrese el código del estudiante: ");
                    String codigoEstudiante = scanner.next();
                    Estudiante estudiante = buscarEstudiante(codigoEstudiante, estudiantes);
                    if (estudiante == null) {
                        System.out.println("No se encontró ningún estudiante con el código ingresado.");
                        break;
                    }

                    System.out.print("Ingrese la identificación del laboratorio: ");
                    String identificacionLaboratorio = scanner.next();
                    Laboratorio laboratorio = buscarLaboratorio(identificacionLaboratorio, laboratorios);
                    if (laboratorio == null) {
                        System.out.println("No se encontró ningún laboratorio con la identificación ingresada.");
                        break;
                    }

                    Asignacion asignacion = new Asignacion(laboratorio, estudiante);
                    if (asignaciones.contains(asignacion)) {
                        System.out.println("El estudiante ya se encuentra asignado a este laboratorio.");
                        break;
                    }
                    if (laboratorio.getNumEquipos() == 0) {
                        System.out.println("No hay cupo disponible en este laboratorio.");
                        break;
                    }

                    asignaciones.add(asignacion);
                    //laboratorio.disminuirCupoDisponible();
                    System.out.println("Estudiante asignado correctamente al laboratorio.");
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor intente de nuevo.");
            }
        } while (opcion != 4);
    }

    private static Estudiante buscarEstudiante(String codigo, ArrayList<Estudiante> estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo().equals(codigo)) {
                return estudiante;
            }
        }
        return null;
    }

    private static Laboratorio buscarLaboratorio(String identificacion, ArrayList<Laboratorio> laboratorios) {
        for (Laboratorio laboratorio : laboratorios) {
            if (laboratorio.getIdentificacion().equals(identificacion)) {
                return laboratorio;
            }
        }
        return null;
    }

    private static ArrayList<Estudiante> buscarEstudiantesPorLaboratorio(Laboratorio laboratorio, ArrayList<Asignacion> asignaciones) {
        ArrayList<Estudiante> estudiantesAsignados = new ArrayList<>();
        for (Asignacion asignacion : asignaciones) {
            if (asignacion.getLaboratorio().equals(laboratorio)) {
                estudiantesAsignados.add(asignacion.getEstudiante());
            }
        }
        return estudiantesAsignados;
    }
}