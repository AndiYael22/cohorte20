package clases;

public class animales {
	private String raza;
	private String nombre;
	private int edad;
	public animales( String Nraza, String Nnombres) {
		raza=Nraza;
	nombre=Nnombres;
	}
public animales() {
	
}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public String getraza() {
		return raza;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int Nedad) {
		edad=Nedad;
	}
	
	

}
