package polimorfismo;

import java.util.Scanner;

public class rectangulo extends FiguraGeometrica{
	Scanner s=new Scanner(System.in);
private double base;
private double altura;

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		 System.out.println("cuadrado");
		 System.out.println("introduzca la base");
		 base = s.nextDouble();
		 System.out.println("introduzca la altura");
		 altura = s.nextDouble();
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado= base* altura;
	}

}
