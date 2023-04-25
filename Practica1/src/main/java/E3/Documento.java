package E3;

public class Documento {
    private String nombre;
    private String contenido;

    public Documento(String nombre) {
        this.nombre = nombre;
        this.contenido = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void agregarContenido(String contenido) {
        this.contenido += contenido;
    }

    public void borrarContenido() {
        this.contenido = "";
    }

    public void mostrar() {
        System.out.println("Nombre del documento: " + nombre);
        System.out.println("Contenido:");
        System.out.println(contenido);
    }

    public void imprimir() {
        System.out.println("Imprimiendo documento " + nombre);
        System.out.println(contenido);
    }
}
