package ejecutar_abs;

import java.util.Scanner;

import polimorfismo.FiguraGeometrica;
import polimorfismo.cuadrado;
import polimorfismo.rectangulo;
import polimorfismo.triangulo;

public class EjecutarAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=0;
		Scanner s=new Scanner(System.in);
FiguraGeometrica ef=new triangulo();
FiguraGeometrica c=new cuadrado();
FiguraGeometrica cir=new cuadrado();
FiguraGeometrica r=new rectangulo();
do {

	System.out.println("\n el area de que figura deseas obtener"
			+ "\n 1-Triangulo"
			+ "\n 2-Cuadrado"
			+ "\n 3-Circulo"
			+ "\n 4-Rectangulo"
			+ "\n 5-salir");
	op = s.nextInt();
	switch(op){
	case 1:
		System.out.println("area de un triangulo");
		ef.pedirDatos();
		ef.area();
		ef.visualizar();
		break;
	case 2:
		System.out.println("----------------------------");
		System.out.println("area de un cuadrado");
		c.pedirDatos();
		c.area();
		c.visualizar();
		break;
	case 3:
		System.out.println("----------------------------");
		
		System.out.println("area de un circulo");
		cir.pedirDatos();
		cir.area();
		cir.visualizar();
		break;
	case 4:

		System.out.println("----------------------------");
		
		System.out.println("area de un reectangulo");
		r.pedirDatos();
		r.area();
		r.visualizar();
		break;
		
	}
	
}while(op!=5);

	
	
	
	
	
	}

}
