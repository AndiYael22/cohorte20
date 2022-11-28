package polimorfismo;

import java.util.Scanner;

public abstract class FiguraGeometrica {
//	protected double pValor;
	//protected double sValor;
	protected double resultado;
	Scanner s;
	public abstract  void pedirDatos() ;
	
	public abstract void area();
	
public void visualizar() {
	System.out.println("el resultado del area es: "+resultado);
}

}
