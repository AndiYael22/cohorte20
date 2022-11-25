package mis_clases.excepciones;

public class EjemploExcep {
	
	public static int dividir(int a, int b){
		
		int r =0;
		try {
			
		
		r=a/b;
		}catch(Exception e) {
			System.out.println("no se pue dividir por0");
		}
		return r;
		
		
	}
public static void main (String[] args) {
	System.out.println(dividir(4,0));
	
}
}
