package ejerciciosvarios;
public class Orden {
	protected String nombre;
	protected String fechaOrden;
	protected int precio;
	protected int numPedido;
	protected Cliente cliente;
	protected Empleado empleado;
	
	public Orden (String nombre,String fechaOrden,int precio) {
		this.nombre=nombre;
		this.fechaOrden=fechaOrden;
		this.precio=precio;
	}
	
	public void infoPedido() {
		System.out.println("Nombre orden: "+nombre+"Fecha de orden: "+fechaOrden+"Precio: "+precio+"$");
	}
	
	public void setFechaOrden(String fechaOrden) {
		this.fechaOrden=fechaOrden;
	}
	
	public void infoCliente() {
		System.out.println("El cliente correspondiente al pedido numero "+numPedido+"es: "+cliente.nombre);
	}
	
	public void infoEmpleado() {
		System.out.println("El empleado que ha atendido el pedido numero "+numPedido+"es: "+empleado.numEmpl);
	}
	
	public static void main(String[]args){
		Orden o1 = new Orden ("Chaqueta", "09/12/2022", 98);
		o1.infoEmpleado();
		o1.infoCliente();
		o1.infoPedido();
		o1.setFechaOrden("12/12/1997");
		System.out.println(o1.fechaOrden);
		
}

}