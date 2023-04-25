package E5;

public class Enciclopedia {
    private String codigo;
    private String titulo;
    private String autor;
    private int volumen;
    private int numPaginas;

    public Enciclopedia(String codigo, String titulo, String autor, int volumen, int numPaginas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.volumen = volumen;
        this.numPaginas = numPaginas;
    }

    // Getters and setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
