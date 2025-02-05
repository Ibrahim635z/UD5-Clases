package POO.src.Autodidacta.ejercicio1;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Persona[] p=new Persona[3];
        Scanner entrada=new Scanner(System.in);

            //la posicion 0 del array es de tipo persona hay q hacer esto para que funcione
           


            System.out.println("Introduzca el nombre de la persona");
            p[0]=new Persona(entrada.nextLine());
            
        
            
            System.out.println(p[0].toString());
            System.out.println(p[0].getnombre());
        


        entrada.close();
    }
}
