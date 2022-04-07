package Excepciones;

public class Ejercicio6{


    public static void main(String[] args) throws Excepcion2{
        new Ejercicio5().f();
    }
    public void f() throws Excepcion2{
        try{
            g();
        }catch(Excepcion1 e){

            e.printStackTrace();
            throw new Excepcion2("ejemplo");
        }
    }
    public void g() throws Excepcion1{
        try{

            throw new Excepcion1("ejemplo2");
        }catch(Exception e){
            throw new RuntimeException("Se ha producido una excepción con el mensaje: " + e.getMessage(), e);

        }
    }

}