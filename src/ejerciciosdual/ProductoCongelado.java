package ejerciciosdual;

public class ProductoCongelado extends Producto{
protected String nombre;
protected int tempRecomendada;


ProductoCongelado(String nombre,String fecha_cad, int numLote, int tempRecomendada){
	super(fecha_cad, numLote);
	this.nombre = nombre;
	this.tempRecomendada=tempRecomendada;

}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre= nombre;
}

public int getTempRecomendada() {
	return tempRecomendada;
}

public void setTempRecomendada(int tempRecomendada) {
	this.tempRecomendada = tempRecomendada;
}




}
