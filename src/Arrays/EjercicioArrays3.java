package Arrays;


import java.util.ArrayList;
import java.util.Arrays;

public class EjercicioArrays3 {
	public static void main(String[] args) {
		try {
	
		int numeros[] = {1,2,3,4,5};
		System.out.println(Arrays.toString(otromas(numeros)));
	}catch(Prueba e) {
		e.printStackTrace();}
	}
	
	public static int [] otromas (int numeros[]) throws Prueba {
		int [] array2 = new int[2];
		try{
			if(numeros.length%2==0) {
		
			int posicion=0;
			int posiCentral = (numeros.length/2-1);
			
			for(int i=posiCentral; i<=posiCentral +1; i++) {
				array2[posicion]=numeros[i];
				posicion++;
			}
		}else {
			throw new Prueba("Excepciojn");
		}
		}catch (Prueba e) {
			e.printStackTrace();
		}
		return array2;
		
		

}}

/*-------------------------------------------------------------

public class EjercicioArrays3 {
	
}*/
