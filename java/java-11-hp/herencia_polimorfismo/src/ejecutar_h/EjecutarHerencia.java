package ejecutar_h;

import Herencia.Hija;
import Herencia.Padre;

public class EjecutarHerencia {
 public static void main(String[] args) {
	Padre p= new Padre("Juan","pachuca");
	 p.mostrarDatos();
	 Hija h =new Hija("Dora","Cdmx",12);
	 h.mostrarDatos();
	 Hija h1 =new Hija("diego","Cdmx",12);
	 h.mostrarDatos("cruz");
 }
}
