package mis_clases.excepciones.ejecuta;

import mis_clases.excepciones.operacion.OpExcep;
import mis_clases.excepciones.operacion.division;

public class TestExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			division d = new division(4,2);
			d.visualizarb();			
		}catch(OpExcep e) {
			System.out.println(e.getMessage());
			
		}

	System.out.println("....");

	}

}
