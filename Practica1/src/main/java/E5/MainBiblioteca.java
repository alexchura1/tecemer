package E5;

import java.util.Scanner;

public class MainBiblioteca {

    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;
        
        while(opcion != 6) {
            System.out.println("---- MENÚ DE OPCIONES ----");
            System.out.println("1. Agregar libro");
            System.out.println("2. Agregar enciclopedia");
            System.out.println("3. Agregar mapa");
            System.out.println("4. Agregar revista");
            System.out.println("5. Agregar cartilla");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.print("Ingrese el código del libro: ");
                    String codigoLibro = scanner.next();
                    System.out.print("Ingrese el título del libro: ");
                    String tituloLibro = scanner.next();
                    System.out.print("Ingrese el autor del libro: ");
                    String autorLibro = scanner.next();
                    System.out.print("Ingrese el número de páginas del libro: ");
                    int numPaginasLibro = scanner.nextInt();
                    
                    Libro libro = new Libro(codigoLibro, tituloLibro, autorLibro, numPaginasLibro);
                    biblioteca.agregarLibro(libro);
                    break;
                case 2:
                    System.out.print("Ingrese el código de la enciclopedia: ");
                    String codigoEnciclopedia = scanner.next();
                    System.out.print("Ingrese el título de la enciclopedia: ");
                    String tituloEnciclopedia = scanner.next();
                    System.out.print("Ingrese el autor de la enciclopedia: ");
                    String autorEnciclopedia = scanner.next();
                    System.out.print("Ingrese el número de páginas de la enciclopedia: ");
                    int numPaginasEnciclopedia = scanner.nextInt();
                    System.out.print("Ingrese el volumen de la enciclopedia: ");
                    int volumenEnciclopedia = scanner.nextInt();
                    
                    Enciclopedia enciclopedia = new Enciclopedia(codigoEnciclopedia, tituloEnciclopedia, autorEnciclopedia, volumenEnciclopedia, numPaginasEnciclopedia);
                    biblioteca.agregarEnciclopedia(enciclopedia);
                    break;
                case 3:
                    System.out.print("Ingrese el código del mapa: ");
                    int codigoMapa = scanner.nextInt();
                    System.out.print("Ingrese el título del mapa: ");
                    String tituloMapa = scanner.next();
                    System.out.print("Ingrese el autor del mapa: ");
                    String autorMapa = scanner.next();
                    System.out.print("Ingrese la ubicación del mapa: ");
                    String ubicacionMapa = scanner.next();
                    System.out.print("Ingrese la latitud del mapa: ");
                    double latitudMapa = scanner.nextDouble();
                    System.out.print("Ingrese la longitud del mapa: ");
                    double longitudMapa = scanner.nextDouble();
                    
                    Mapa mapa = new Mapa(codigoMapa, tituloMapa, autorMapa, ubicacionMapa, latitudMapa, longitudMapa);
                    biblioteca.agregarMapa(mapa);
                    break;
                case 4:
                    System.out.print("Ingrese el código de la revista: ");
                    int codigoRevista = scanner.nextInt();
                    System.out.print("Ingrese el título de la revista: ");
                    String tituloRevista = scanner.next();
                    System.out.print("Ingrese el nombre del autor: ");
                    String autorRevista = scanner.next();
                    System.out.print("Ingrese la cantidad de articulos de la revista: ");
                    int articulosRevista = scanner.nextInt();
                    
                    Revista revista = new Revista(codigoRevista, tituloRevista, autorRevista, articulosRevista );
                    biblioteca.agregarRevista(revista);
                    break;
                case 5:
                    System.out.print("Ingrese el código de la cartilla: ");
                    String codigoCartilla = scanner.next();
                    System.out.print("Ingrese el título de la cartilla: ");
                    String tituloCartilla = scanner.next();
                    System.out.print("Ingrese el autor de la cartilla: ");
                    String autorCartilla = scanner.next();
                    System.out.print("Ingrese el número de páginas de la cartilla: ");
                    String temaCartilla = scanner.next();

                    Cartilla cartilla = new Cartilla(codigoCartilla, tituloCartilla, autorCartilla, temaCartilla);
                    biblioteca.agregarCartilla(cartilla);
                    break;
                case 6:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

            System.out.println();
        }

    }
}