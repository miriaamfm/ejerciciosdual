package ejerciciosdual;

public class Producto {
	protected String fecha_cad;
	protected int numLote;
	
	public Producto(String fecha_cad, int numLote) {
		this.fecha_cad="";
		this.numLote=0;
	}

	public String getFecha_cad() {
		return fecha_cad;
	}

	public void setFecha_cad(String fecha_cad) {
		this.fecha_cad = fecha_cad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}
	

	
}
