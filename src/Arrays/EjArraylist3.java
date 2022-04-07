package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class EjArraylist3 {
    public static void main(String[] args){
        try {
            ArrayList<Integer> numeros = new ArrayList();
            numeros.add(1);
            numeros.add(2);
            numeros.add(3);
            numeros.add(4);
            numeros.add(5);
            numeros.add(6);
            System.out.println(Arrays.toString(otromas(numeros)));
        }catch(Prueba e) {
            e.printStackTrace();}
    }


    public static int [] otromas (ArrayList <Integer> numeros) throws Prueba {
        int [] array2 = new int[2];
        try{
            if(numeros.size()%2==0) {

                int posicion=0;
                int posiCentral = (numeros.size()/2-1);

                for(int i=posiCentral; i<=posiCentral +1; i++) {
                    array2[posicion]=numeros.get(i);
                    posicion++;
                }
            }else {
                throw new Prueba("Excepciojn");
            }
        }catch (Prueba e) {
            e.printStackTrace();
        }
        return array2;

    }
}
