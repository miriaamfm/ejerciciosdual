package Excepciones;

public class Ejercicio10B extends Ejercicio10A{
    public void a(){
        try{
            System.out.println("nublado");
        }catch(Exception e){
            System.out.println("errorsito"+e);
            e.printStackTrace();

        }
    }
}