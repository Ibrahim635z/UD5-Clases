package POO.src.Autodidacta.ejercicio1;

public class Persona {
    String nombre;

    public Persona (String nombre){
        this.nombre=nombre;
    }
    public String toString(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre=nombre;
    }

    public  String getnombre(){
        return nombre;
    }
}
