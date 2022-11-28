package polimorfismo;

import java.util.Scanner;

public class circulo extends FiguraGeometrica{
	Scanner s=new Scanner(System.in);
private double radio;
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		 System.out.println("circulo");
		 System.out.println("introduzca la base");

		 radio = s.nextDouble();

	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado=Math.PI*(Math.pow(radio, 2));
	}

}
