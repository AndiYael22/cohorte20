package polimorfismo;

import java.util.Scanner;

public class cuadrado  extends FiguraGeometrica{
	Scanner s=new Scanner(System.in);
private double lado;

	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado= lado* lado;
	}
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		 System.out.println("cuadrado");
		 System.out.println("introduzca lado");
		 lado = s.nextDouble();
	}

}
