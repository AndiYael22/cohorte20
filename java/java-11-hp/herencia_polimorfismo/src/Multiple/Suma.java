package Multiple;

public class Suma implements OperacionesAritmeticas, Operaciones{
	private double a;
	private double b;
	@Override
	public double suma() {
		// TODO Auto-generated method stub
		return a+b;
	}

	public Suma(double a, double b) {

		this.a = a;
		this.b = b;
	}

	@Override
	public double resta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mensajes() {
		// TODO Auto-generated method stub
		System.out.println("hola soy una suma");
		
	}


}
