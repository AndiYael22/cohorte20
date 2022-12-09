package MaximoComunDivisor;

import java.util.Scanner;

public class MCD {

	public static void main(String[] args) {
		
		//1 pedir los datos y asignarlos a variables
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce el primer numero");
		int num1  = sc.nextInt();
		
		//1 pedir los datos y asignarlos a variables
		
		System.out.println("Introduce el segundo numero");
		int num2  = sc.nextInt();
		
		int res = MCD(num1, num2);
		
		System.out.println("El MCD " + res);
		
	}
	
		
		//Funcion que nos permita calcualr el MCD a partir de los dos datos guardados
		public static int MCD(int num1, int num2) {
			
			// comparamos ambos valores 12028 y el 12772. Sacamos el max y el min
			int a = Math.max(num1, num2); //el maximo se guarda en a (12772)
			int b = Math.min(num1, num2); // el minimo se guarda en b (12028)
			
			
			int resultado = 0; //esta variable la dejamos en 0
			
			
			//voy a hacer este proceso....
			do {
			
			resultado = b; //resultado toma el valor del numero menor (12028)
			b = a % b; //ahora, el valor de b sera el residuo de dividir el numero mayor entre el numero menor
			a = resultado;  //cuando finalice el proceso, ese valor se lo pongo a la variable a

			
			//mientras b (12028) sea diferente de 0
			} while (b !=0);
			
			return resultado;
	}
}
		

/*
 * 1. Pedir dos numeros (valor a y el valor b). Para eso usamos un scanner
 * 2. Guardar estos datos en variables independientes, con el tipo de dato esperado.
 * 3. Vamos a comparlos para saber cual es el maxico comun divisor de ambos numeros
 * 
 * 
 * 
*/
