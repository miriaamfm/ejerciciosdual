package ejerciciosvarios;
public class Empleado {
	
	protected int numEmpl;
	protected int saldoCuentaBanco = 200;
	
	
	public Empleado(int numEmpl) {
		
		this.numEmpl=numEmpl;
	}
	
	public void fichaTecnica() {
		System.out.println("Empleado num: "+numEmpl);
	}
	
	public int cobrar(){
		int salario=1000;
		saldoCuentaBanco=(saldoCuentaBanco+salario);
		return saldoCuentaBanco;
		}
	
	public void trabajando(boolean trabajar) {
		
		if(trabajar == true) {
		System.out.println("Trabajando");
		
		}else
			System.out.println("Descansando");
		}
		
		
	
	public static void main(String[]args){
		Empleado e1 = new Empleado(5);
		e1.fichaTecnica();
		System.out.println(e1.saldoCuentaBanco);
		e1.cobrar();
		System.out.println(e1.saldoCuentaBanco);
		e1.trabajando(true);
		}
}
