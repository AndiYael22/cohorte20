package mis_clases.excepciones.operacion;

public class division {
private int numerador, denominador;

public division(int numerador, int denominador) throws OpExcep{
	if(denominador==0) {
		throw new OpExcep("el denominaor es 0");
	}  
	
	this.numerador = numerador;
	this.denominador = denominador;
}

public void visualizarb() {
	System.out.println("resultado de la division: "+ (this.numerador/this.denominador));
}

}
