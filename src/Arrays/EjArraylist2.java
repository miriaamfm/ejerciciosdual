package Arrays;

import java.util.ArrayList;

public class EjArraylist2 {
    public class EjercicioArrays2 {

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
            boolean resultado = false;
            for(int i=0; i<numeros.size(); i++) {
                switch(numeros.get(i)) {
                    case 2 , 3: resultado=false;
                        break;

                }
            }return resultado;
        }
    }
}
