package ejerciciosvarios;

public class Cliente {
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected String direccion;
	protected int saldoTarjeta = 100;
	
	public Cliente(String nombre, String apellido, int edad, String direccion) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.direccion=direccion;
		
	}
	public void presentarse(){
	System.out.println("Hola me llamo "+nombre+" "+apellido);
	}
	
	public int comprarRopa(int unidades){
		int acumulador;
		int precio=25;
		acumulador=unidades*precio;
		saldoTarjeta=saldoTarjeta-acumulador;
		return acumulador;
	}
	
	public void cambioSaldo(int saldoTarjeta) {
		this.saldoTarjeta=saldoTarjeta;
	}

	public void cambioDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void cumpleAnio() {
		edad++;
	}
	
public static void main(String[]args){
	Cliente c1 = new Cliente("Pepe","Ruiz",29,"C/Agua");
		System.out.println(c1.direccion);
		c1.presentarse();
		c1.cambioDireccion("C/Piso");
		System.out.println(c1.direccion);
		System.out.println(c1.saldoTarjeta);
		c1.comprarRopa(2);
		System.out.println(c1.saldoTarjeta);
		System.out.println(c1.edad);
		c1.cumpleAnio();
		System.out.println(c1.edad);
		c1.cambioSaldo(5000);
		System.out.println(c1.saldoTarjeta);
	}
}
