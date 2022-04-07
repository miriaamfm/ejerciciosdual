package Excepciones;

public class Excepcion1 extends Throwable{

    private String texto;

    public Excepcion1 (String texto){
        super("Excepcion2"+texto);


    }
}