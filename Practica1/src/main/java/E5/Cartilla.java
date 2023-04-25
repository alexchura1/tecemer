package E5;

public class Cartilla {
    private String codigo;
    private String titulo;
    private String autor;
    private String tema;

    public Cartilla(String codigo, String titulo, String autor, String tema) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
    }

    // Getter methods
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTema() {
        return tema;
    }

    // Setter methods
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    // toString method
    @Override
    public String toString() {
        return "Cartilla{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tema='" + tema + '\'' +
                '}';
    }
}
