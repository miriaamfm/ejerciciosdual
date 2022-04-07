package Excepciones;

import java.util.Scanner;



import java.util.Scanner;

    public class Ejercicio9 extends Throwable{



        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            int edad = sc.nextInt();

            do{
                System.out.println("numerito");
                edad= sc.nextInt();
                try{
                    System.out.println("numero; "+edad);
                }catch(NullPointerException e){
                    System.out.println("Fallito: "+e.getMessage());
                }
            }while(edad>=5);
        }
    }