package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class EjArrayslist4 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        System.out.println(numeros);
        otromas(numeros);
        System.out.println(numeros);

    }


    public static void otromas (ArrayList <Integer> numeros) {
        Collections.reverse(numeros);


    }
}
