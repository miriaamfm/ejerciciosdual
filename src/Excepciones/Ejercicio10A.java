package Excepciones;

public class Ejercicio10A{
    public void a(){
        try{
            System.out.println("solito");
        }catch(Exception e){
            System.out.println("errorsito"+e);
            e.printStackTrace();

        }
    }
}
