package Excepciones;

public class Ejercicio8{

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        int[]numero= {1,2,3};

        try{
            System.out.println(numero[4]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error en: "+e.getMessage());
        }
    }
}