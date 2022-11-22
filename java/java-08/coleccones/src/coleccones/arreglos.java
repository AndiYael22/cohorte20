package coleccones;

import java.util.Arrays;

public class arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] miArreglo=new String [6];
		miArreglo[0]="andi";
		miArreglo[1]="andi1";
		miArreglo[2]="andi2";
		miArreglo[3]="andi3";
		miArreglo[4]="andi4";
		miArreglo[5]="andi5";
		
		
		System.out.println(miArreglo[0]);
	
		for (int i =0; i<miArreglo.length; i++) {
			System.out.println(miArreglo[i]);
			
		}
		System.out.println("--------------");

		
		for(String nombre : miArreglo) {
			System.out.println("for each"+nombre);
		}
		
		
 System.out.println(Arrays.toString(miArreglo));

	
 int numeros [] = new int [5];

 numeros[0]=3;
 numeros[1]=-56;
 numeros[2]=(int)3.45; //casteo== cambiar el valor original a otro tipo de valor
 numeros[3]=Integer.parseInt("2"); // parseo== cambiar la clase del valor
	for(int numero:numeros) {
		System.out.println("valores del arreglo numero: "+numero);
	}
	
	
	persona persona1=new persona("pancho",30);
	persona persona2=new persona("pary",58);
	
	persona[] arrPersonas=new persona[3];
	arrPersonas[0]=persona1;
	arrPersonas[1]=persona2;
	arrPersonas[2]=new persona("luis",19);
	System.out.println(arrPersonas[0]);

	System.out.println(arrPersonas[1]);

	System.out.println(arrPersonas[2]);
	
	for(persona persona:arrPersonas)
	{

		System.out.println("nombre  "+persona.nombre+"  eddad  "+ persona.edad);
	}
	
	String [] arrString = {"manzana","pera","12","hola"	};

	System.out.println(Arrays.toString(arrString));
	}

  
}
