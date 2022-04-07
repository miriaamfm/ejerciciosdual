package Arrays;

import java.util.ArrayList;

public class EjercicioArrays2 {
	
	public static void main(String[] args) {
		int numeros[] = {1,2,3,4,5,6};
		System.out.println(comprobador(numeros));
		
	}
	
	public static boolean comprobador(int numeros[]) {
		
		boolean resultado = true;
		for(int i=0; i<numeros.length; i++) {
			switch(numeros[i]) {
			case 2 , 3: resultado=false;
			break;
			
			}
			
		}
		return resultado;
		
		
	}
	}

/*-------------------------------------------------------------*/

/*
*/