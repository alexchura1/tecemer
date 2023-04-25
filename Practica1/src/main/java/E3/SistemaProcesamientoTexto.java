package E3;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaProcesamientoTexto {
    private static Scanner scanner = new Scanner(System.in);
    private static Directorio directorio = new Directorio();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("=== Sistema de Procesamiento de Texto ===");
            System.out.println("1. Crear documento");
            System.out.println("2. Modificar documento");
            System.out.println("3. Mostrar documento");
            System.out.println("4. Mostrar todos los documentos");
            System.out.println("5. Borrar documento");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearDocumento();
                    break;
                case 2:
                    modificarDocumento();
                    break;
                case 3:
                    mostrarDocumento();
                    break;
                case 4:
                    mostrarTodosLosDocumentos();
                    break;
                case 5:
                    borrarDocumento();
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

        System.out.println("Gracias por usar el Sistema de Procesamiento de Texto");
    }

    private static void crearDocumento() {
        System.out.print("Ingrese el nombre del documento: ");
        String nombre = scanner.nextLine();
        Documento documento = new Documento(nombre);
        directorio.agregarDocumento(documento);
        System.out.println("Documento creado exitosamente");
    }

    private static void modificarDocumento() {
        System.out.print("Ingrese el nombre del documento: ");
        String nombre = scanner.nextLine();
        Documento documento = directorio.buscarDocumento(nombre);

        if (documento == null) {
            System.out.println("Documento no encontrado");
        } else {
            System.out.print("Ingrese el nuevo contenido del documento: ");
            String contenido = scanner.nextLine();
            documento.setContenido(contenido);
            System.out.println("Documento modificado exitosamente");
        }
    }

    private static void mostrarDocumento() {
        System.out.print("Ingrese el nombre del documento: ");
        String nombre = scanner.nextLine();
        Documento documento = directorio.buscarDocumento(nombre);

        if (documento == null) {
            System.out.println("Documento no encontrado");
        } else {
            System.out.println("=== " + documento.getNombre() + " ===");
            System.out.println(documento.getContenido());
        }
    }

    private static void mostrarTodosLosDocumentos() {
        ArrayList<Documento> documentos = directorio.getDocumentos();

        if (documentos.isEmpty()) {
            System.out.println("No hay documentos en el directorio");
        } else {
            System.out.println("Documentos en el directorio:");
            for (Documento documento : documentos) {
                System.out.println("- " + documento.getNombre());
            }
        }
    }

    private static void borrarDocumento() {
        System.out.print("Ingrese el nombre del documento: ");
        String nombre = scanner.nextLine();
        Documento documento = directorio.buscarDocumento(nombre);

        if (documento == null) {
            System.out.println("Documento no encontrado");
        } else {
            directorio.borrarDocumento(documento);
            System.out.println("Documento borrado exitosamente");
        }
    }
}
