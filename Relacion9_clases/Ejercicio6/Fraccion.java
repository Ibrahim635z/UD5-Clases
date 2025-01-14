package POO.src.Relacion9_clases.Ejercicio6;

public class Fraccion {

    // atributos de objetos
    int numerador,denominador;

  
    // metodos de clase
   
    static Fraccion MultiplicaFraccion(Fraccion f1,Fraccion f2){
        Fraccion resultado=new Fraccion();
        resultado.setFraccion(f1.getNumerador() * f2.getNumerador(),f1.getDenominador() * f2.getDenominador());
        return resultado;
    }

    static Fraccion divideFraccion(Fraccion f1, Fraccion f2){
        Fraccion resultado=new Fraccion();
        resultado.setFraccion(f1.getNumerador() * f2.getDenominador(), f1.getDenominador() * f2.getNumerador());
        return resultado;        
    }

    
    // métodos de objeto
    void invierte(){
        int temp;

        temp = numerador;
        numerador = denominador;
        denominador = temp;
    }

    void setFraccion(int num,int den){
        numerador=num;
        denominador=den;
    }
    int getNumerador(){
        return numerador;
    }
    int getDenominador(){
        return denominador;
    }
    
   
}
