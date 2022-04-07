package Excepciones;

public class Ejercicio2 extends Throwable{
    private String mensajito;

    public Ejercicio2 (String mensaje){
        super(mensaje);
        this.mensajito=mensaje;
    }

    public void printMessage(){
        System.out.println(this.mensajito);
    }


}
