package ejecutar;

import clases.animales;

public class Panimal {
	public static void main(String[] args) {
	
	animales x=new animales("solovino"," Falco");
	
	x.setEdad(3);
	System.out.println("el nombre es: "+x.getNombre()+ " su raza es "+ x.getraza());
	System.out.println("y tiene "+ x.getEdad()+ " años");
	
	animales otroAnimal;
	otroAnimal=new animales();
	otroAnimal.setNombre("pulgas");
	otroAnimal.setEdad(7);
	otroAnimal.setRaza("solovino2.0");
	
	System.out.println("el mnuevo animal es "+ otroAnimal.getNombre()+ " su raza es "+ otroAnimal.getraza());
	System.out.println("su eddad es "+ otroAnimal.getEdad());
	}
	
}
