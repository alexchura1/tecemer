package E5;

public class Mapa {
    private int codigo;
    private String titulo;
    private String autor;
    private String ubicacion;
    private double latitud;
    private double longitud;
    
    public Mapa(int codigo, String titulo, String autor, String ubicacion, double latitud, double longitud) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.ubicacion = ubicacion;
        this.latitud = latitud;
        this.longitud = longitud;
    }
    
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
    
    public String getUbicacion() {
        return ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public double getLatitud() {
        return latitud;
    }
    
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    
    public double getLongitud() {
        return longitud;
    }
    
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
