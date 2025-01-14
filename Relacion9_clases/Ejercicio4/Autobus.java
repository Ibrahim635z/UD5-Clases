package POO.src.Relacion9_clases.Ejercicio4;

public class Autobus {
    
    String matricula;
    String modelo;
    int potenciaCV;
    int numeroPlazas;

    void setnumeroPlaza(int plazas){

        numeroPlazas=plazas;
    }
    
    String getMatricula(){
        return matricula;
    }
    String getModelo(){
        return modelo;
    }
    int getpotenciaCV(){
        return potenciaCV;
    }
    int getnumeroPlaza(){
        return numeroPlazas;
    }

}
