package Excepciones;

public class Empleado {
    protected String nombre;
    protected String cedula;
    protected int edad;
    protected boolean casado;
    protected double salario;

    public Empleado( int edad) {
        this.edad=edad;
    }

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre=nombre;
        this.cedula=cedula;
        if(edad>=18 && edad<=45) {
            this.edad=edad;
        }else {
            System.out.println("edad entre 18 y 45");
        }
        this.casado=casado;
        this.salario=salario;
    }
    public void clasificacion(int edad) {
        String resultado;
        if(edad<=21) {
            resultado = "Principiante";
            System.out.println(resultado);
        }else if(edad>=22 && edad<=35) {
            resultado= "Intermedio";
            System.out.println(resultado);
        }else {
            resultado= "Senior";
            System.out.println(resultado);
        }
    }
    @Override
    public String toString() {
        return "nombre: "+nombre+"\n cedula: "+cedula+ "\n edad: "+edad+"\n casado: "+casado+"\n salario: "+salario;

    }

    public void aumentarSalario(double d) {
        this.salario= salario+(salario*d)/100;
    }
}