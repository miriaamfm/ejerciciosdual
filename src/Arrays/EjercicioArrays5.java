package Arrays;

import java.util.Arrays;

public class EjercicioArrays5 {
	
		public static void main(String[] args) {
			String numeros[] = {"maria1","1","hola3","cero","patata"};
			String valor= "1";
			 System.out.println(buscaString(numeros, valor));
		

	}
		public static boolean buscaString(String[] numeros, String valor) {
		    for(String s: numeros){
		        if(s.equals(valor))
		            return true;
		    }
		    return false;
		}



}
/**/