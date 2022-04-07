package Excepciones;

public class Ejercicio4 extends Throwable{


    public static void main(String[] args) {
        Empleado e1 = null;


        try{
            System.out.println(e1.nombre);
        }catch(NullPointerException e){
            System.out.println("Fallito: "+e.getMessage());
        }
    }
}
