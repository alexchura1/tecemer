package E2;

import java.time.LocalTime;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto RelojDigital
        RelojDigital reloj = new RelojDigital();

        // Variable para controlar la ejecución del programa
        boolean ejecutando = true;

        while (ejecutando) {
            // Mostrar el menú
            System.out.println("1. Ver la hora actual");
            System.out.println("2. Modificar la hora");
            System.out.println("3. Detener el programa");

            // Leer la opción del usuario
            System.out.print("Selecciona una opción: ");
            String opcionTexto = scanner.nextLine();

            try {
                int opcion = Integer.parseInt(opcionTexto);

                switch (opcion) {
                    case 1:
                        // Mostrar la hora actual
                        System.out.println("La hora actual es: " + reloj.mostrarHora());
                        break;
                    case 2:
                        // Pedir al usuario que introduzca la nueva hora
                        System.out.print("Introduce la hora (en formato HH:mm): ");
                        String horaTexto = scanner.nextLine();

                        // Convertir la entrada del usuario en un objeto LocalTime
                        LocalTime nuevaHora = LocalTime.parse(horaTexto);

                        // Establecer la nueva hora en el objeto RelojDigital
                        reloj.setHoraActual(nuevaHora);

                        // Mostrar un mensaje de confirmación
                        System.out.println("La hora ha sido actualizada.");
                        break;
                    case 3:
                        // Salir del programa
                        ejecutando = false;
                        break;
                    default:
                        // Mostrar un mensaje de error si la opción no es válida
                        System.out.println("Opción no válida. Introduce una opción entre 1 y 3.");
                        break;
                }
            } catch (NumberFormatException e) {
                // Mostrar un mensaje de error si la entrada del usuario no es un número válido
                System.out.println("Opción no válida. Introduce una opción entre 1 y 3.");
            } catch (Exception e) {
                // Mostrar un mensaje de error si la entrada del usuario no es una hora válida
                System.out.println("Hora no válida. Introduce una hora en formato HH:mm.");
            }
        }

        // Mostrar un mensaje de despedida al usuario
        System.out.println("Programa detenido.");
    }
}