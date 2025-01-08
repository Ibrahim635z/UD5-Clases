package POO.src.Relacion9_clases.Ejercicio3;

public class Pelopicopata {
    
    public static void main(String[] args) {

        Gato gato= new Gato();
        Animal animal= new Animal();
        Ave aves= new Ave();
        Perro perro= new Perro();
        Mamifero mamifero= new Mamifero();

        String ojo1,tipo,vuela,ubicacion;
        int años=3;
        ojo1="rojo";
        tipo="mamifero";
        vuela="no";
        ubicacion="africa";

        gato.establecerojos(ojo1);
        animal.establecertipo(tipo);
        aves.establecervuela(vuela);
        perro.establecerEdad(años);
        mamifero.establecerLugar(ubicacion);
        
           
        

        System.out.println("los ojos son: " + gato.obtenerojos());
        System.out.println("El gato es un "+ animal.obtenertipo());
        System.out.println("¿el pingüino vuela? "+ aves.obtenervuela());
        System.out.println("¿cuantos años tiene el perro? " + perro.obtenerEdad());
        System.out.println("El lemur vive en " + mamifero.obtenerLugar());
    }
}
