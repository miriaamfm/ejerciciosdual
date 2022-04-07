package Arrays;

public class EjArraylist5 {
    public static void main(String[] args) {
        String numeros[] = {"maria1","5","hola3","cero","patata"};
        String valor[]= {"1","2","3","4","5","6","7","8","9","0"};
        System.out.println(buscaString(numeros, valor));


    }
    public static boolean buscaString(String[] numeros, String[] valor) {
        for(String s: numeros){
            if(s.equals(valor))
                return true;
        }
        return false;
    }



}

