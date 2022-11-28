package Herencia;

public class Hija extends Padre {
	private int edad;
public Hija(String nombre, String domicilio, int edad) {
		super(nombre, domicilio);
		this.edad=edad;
	}
public void mostrarDatos(){
	System.out.println("el nombre es: "+nombre+
			" "+ "el domicilio es: "+domicilio+" "+ "la edad es: "+ edad);
	
}
public void mostrarDatos(String apellido){
	System.out.println("el nombre es: "+nombre+" su apeido es "+apellido+
			" "+ "el domicilio es: "+domicilio+" "+ "la edad es: "+ edad);
	
}
}