package E5;

public class Revista {
    private int codigo;
    private String titulo;
    private String autor;
    private int numArticulos;

    //Constructor
    public Revista(int codigo, String titulo, String autor, int numArticulos) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.numArticulos = numArticulos;
    }

    //Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumArticulos() {
        return numArticulos;
    }

    public void setNumArticulos(int numArticulos) {
        this.numArticulos = numArticulos;
    }
}
