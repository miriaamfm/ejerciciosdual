package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

 class EjercicioArrays4 {
	public static void main(String[] args) throws Prueba {
		
	
		int numeros[] = {1,2,3,4,5};
		System.out.println(Arrays.toString((numeros)));
		otromas((numeros));
	
	}
	
	public static int [] otromas (int numeros[]) throws Prueba {
		
		
		int[] numeros2 = Arrays.copyOf(numeros, numeros.length);
		for(int i=numeros2.length-1;i>=0;i--)
	         System.out.print(numeros2[i] + "  ");
	         
		
		return numeros2;
}
		

}



