package E1;

public class Curso {
    private int id;
    private String descripcion;
    
    public Curso(){
        this.id = 0;
        this.descripcion = "";
    }
    
    public void SetId(int id){
        this.id = id;
    }
    
    public int GetId(){
        return this.id;
    }
    
    public void SetDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String GetDescripcion(){
        return descripcion;
    }
}
