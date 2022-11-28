package polimorfismo;

import java.util.Scanner;

public class triangulo extends FiguraGeometrica {
	Scanner s=new Scanner(System.in);
	private double base;
	private double altura;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado=(base*altura)/2;
		
	}
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		 System.out.println("triangulo");
		 System.out.println("introduzca la base");
		 base = s.nextDouble();
		 System.out.println("introduzca la altura");
		 altura = s.nextDouble(); 
	}

}
