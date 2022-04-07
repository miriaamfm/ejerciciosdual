package Arrays;

import java.util.ArrayList;

public class EjArraylist1 {
    public class EjercicioArray1 {

        public static void main(String[] args) {
            ArrayList<Integer> numeros = new ArrayList();
            numeros.add(1);
            numeros.add(2);
            numeros.add(3);
            numeros.add(4);
            numeros.add(5);
            numeros.add(6);
            System.out.println(comprobacion(numeros));
        }

        public static boolean comprobacion(ArrayList <Integer> numeros) {
            boolean resultado=false;
            if(numeros.get(0)==6 || numeros.get(5)==6) {
                resultado=true;
                return resultado;
            }else {

                return resultado;
            }
        }
    }
}
