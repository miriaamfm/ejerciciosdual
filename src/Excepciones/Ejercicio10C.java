package Excepciones;

public class Ejercicio10C extends Ejercicio10B{

    public void c(){
        try{
            System.out.println("llueve");
        }catch(Exception e){
            System.out.println("errorsito"+e);
            e.printStackTrace();

        }
    }
}