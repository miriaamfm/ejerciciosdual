package ejerciciosdual;

public class Envio{
protected String medioTransporte;
protected int numCongelados;
protected int numFrescos;
protected int numRefrig;

	public Envio() {
		
	}
	public Envio (String medioTransporte, int numCongelados, int numFrescos, int numRefrig) {
	this.medioTransporte=medioTransporte;

	}

	public String getMedioTransporte() {
		return medioTransporte;
	}

	public void setMedioTransporte(String medioTransporte) {
		this.medioTransporte = medioTransporte;
	}

	
	public String toString() {
		return "metodo envio: "+this.medioTransporte+"/n num Congelados: "+this.numCongelados+"/n numFrescos: "+this.numFrescos+"/n numRefrig: "+this.numRefrig;
	}
	
}