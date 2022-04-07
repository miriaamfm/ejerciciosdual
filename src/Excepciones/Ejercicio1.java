package Excepciones;

public class Ejercicio1{

    public static void main(String[] args){

        try{
            throw new Exception("Probando excepcion1");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
