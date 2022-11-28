package Multiple;

public class TestMultiple {
public static void main (String[]args) {
	Suma suma=new Suma(5,5);
	Resta resta=new Resta(10,5);
	OperacionesAritmeticas oa= new Suma(10,5);
	Operaciones o=new Suma(3,2);
	Operaciones or=new Resta(2,4);
	System.out.println("obj oa: "+oa.suma());
	o.mensajes();
	System.out.println("la suma es : "+suma.suma());
	suma.mensajes();
	resta.mensajes();
	System.out.println("la resta es : "+resta.resta());
	System.out.println("obj oa: "+oa.resta());
	or.mensajes();
}
}
