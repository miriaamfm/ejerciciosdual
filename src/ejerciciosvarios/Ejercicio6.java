package ejerciciosvarios;
public class Ejercicio6 {
    public static void main(String[] args) {
        String palabra= "";

        for (String x: args) {
            palabra=palabra+ " " + x;
        }

        System.out.println(palabra);
    }
}
