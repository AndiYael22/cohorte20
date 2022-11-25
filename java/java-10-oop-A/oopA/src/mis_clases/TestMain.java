package mis_clases;

import clases_publicas.Clase3;
import mis_clases.clase_2.ClasePaadre;
import mis_clases.clase_2.clase_2;

public class TestMain {
	public static void main(String[]args) {
		Clase3 nc3=new Clase3();
		nc3.setValor(03434);
		
		//ClasePaadre cp new ClasePaadre(2,"");
		clase_2 c2 =new clase_2(21,"","");
		c2.visualizar();
		c2.vizualizar2();
	}
}
