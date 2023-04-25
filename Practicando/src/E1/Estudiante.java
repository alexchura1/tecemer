package E1;

public class Estudiante {
    private int id;
    private String nombre;
    private Curso rol;
    
    public Estudiante(){
        this.id = 0;
        this.nombre = "";
        this.rol = rol;
    }
    
    public void SetId(int id){
        this.id = id;
    }
    
    public int GetId(){
        return this.id;
    }
    
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String GetDescripcion(){
        return nombre;
    }
    
    public void SetRol(Curso rol){
        this.rol = rol;
    }
    
    public Curso GetRol(){
        return rol;
    }
    
    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.SetId(1);
        c1.SetDescripcion("Curso de electromecanica industrial");
        
        System.out.println("El curso numero: "+c1.GetId()+" es del tema de: "+c1.GetDescripcion());
    }
}
