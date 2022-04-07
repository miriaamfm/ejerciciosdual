package Excepciones;

public class Main2{
    public static void main (String[] args){
        try{
            throw new Ejercicio2("Error del ejercicio2");
        }catch(Ejercicio2 e){
            e.printMessage();
        }
    }
}