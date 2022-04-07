package Excepciones;

public class Ejercicio3 extends Throwable{

    public static void main(String[] args) throws Ejercicio2{
        throw new Ejercicio2("Error del ejercicio3");
    }

}