package Herencia;

public class Padre {

	protected String nombre;
	protected String domicilio;
	public Padre(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	public void mostrarDatos() {
		System.out.println("el nombre es "+nombre+ " " +"el domicilio es: "+domicilio);
	}
	
}
