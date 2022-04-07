package ejerciciosdual;

public class ProductoFresco extends Producto{
protected int nombre;
	public ProductoFresco(String fecha_cad, int numLote,int nombre) {
		super(fecha_cad, numLote);
		this.nombre=nombre;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	
}
