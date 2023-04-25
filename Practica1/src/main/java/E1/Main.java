package E1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Crear objeto calentador
        CalentadorAgua calentador = new CalentadorAgua(20.0, 40.0, 1.5, false);
        
        // Mostrar temperatura actual
        System.out.println("Temperatura actual: " + calentador.getTemperatura());
        
        // Mostrar opciones de menu
        System.out.println("Opciones: ");
        System.out.println("1. Cambiar temperatura maxima");
        System.out.println("2. Cambiar temperatura minima");
        System.out.println("3. Detener calentador");
        System.out.println("4. Encender calentador");
        System.out.println("5. Mostrar temperatura actual");
        System.out.println("6. Salir");
        
        // Variable para guardar opcion seleccionada por el usuario
        int opcion = 0;
        
        // Ciclo para ejecutar menu mientras el usuario no seleccione la opcion de salir
        while (opcion != 6) {
            // Pedir al usuario que seleccione una opcion
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            
            // Realizar accion correspondiente a la opcion seleccionada
            switch (opcion) {
                case 1:
                    // Pedir al usuario que ingrese la nueva temperatura maxima
                    System.out.print("Ingrese la nueva temperatura maxima: ");
                    double nuevaTempMax = sc.nextDouble();
                    
                    // Cambiar la temperatura maxima del calentador
                    calentador.setTempMax(nuevaTempMax);
                    break;
                case 2:
                    // Pedir al usuario que ingrese la nueva temperatura minima
                    System.out.print("Ingrese la nueva temperatura minima: ");
                    double nuevaTempMin = sc.nextDouble();
                    
                    // Cambiar la temperatura minima del calentador
                    calentador.setTempMin(nuevaTempMin);
                    break;
                case 3:
                    // Detener el calentador
                    calentador.detener();
                    break;
                case 4:
                    // Encender el calentador
                    calentador.encender();
                    break;
                case 5:
                    // Mostrar temperatura actual del calentador
                    System.out.println("Temperatura actual: " + calentador.getTemperatura());
                    break;
                case 6:
                    // Salir del programa
                    System.out.println("Adios!");
                    break;
                default:
                    // Opcion invalida
                    System.out.println("Opcion invalida, por favor intente de nuevo.");
                    break;
            }
        }
        
        // Cerrar scanner
        sc.close();
    }
}
