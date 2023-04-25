package E5;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Enciclopedia> enciclopedias;
    private ArrayList<Mapa> mapas;
    private ArrayList<Revista> revistas;
    private ArrayList<Cartilla> cartillas;

    public Biblioteca() {
        libros = new ArrayList<>();
        enciclopedias = new ArrayList<>();
        mapas = new ArrayList<>();
        revistas = new ArrayList<>();
        cartillas = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarEnciclopedia(Enciclopedia enciclopedia) {
        enciclopedias.add(enciclopedia);
    }

    public void agregarMapa(Mapa mapa) {
        mapas.add(mapa);
    }

    public void agregarRevista(Revista revista) {
        revistas.add(revista);
    }

    public void agregarCartilla(Cartilla cartilla) {
        cartillas.add(cartilla);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public ArrayList<Enciclopedia> getEnciclopedias() {
        return enciclopedias;
    }

    public ArrayList<Mapa> getMapas() {
        return mapas;
    }

    public ArrayList<Revista> getRevistas() {
        return revistas;
    }

    public ArrayList<Cartilla> getCartillas() {
        return cartillas;
    }
}
