package Excepciones;

public class Ejercicio7 {



    public static void main(String[] args) {
        int numero1= Integer.parseInt(null);
        int numero2= Integer.parseInt(null);
        int operacion;
        try{
            operacion= (numero1/numero2);
        }catch(NumberFormatException e){
            System.out.println("formato erroneo: "+e.getMessage());
        }catch(NullPointerException e){
            System.out.println("nulo: "+e.getMessage());
        }catch(Exception ex){
            System.out.println("todo mal: "+ex.getMessage());
        }
    }

}
