package oop;

import java.util.Scanner;

public class OperacionesAritmeticas {
double valor0,valor;
Scanner scanner =new Scanner(System.in);

	Double suma(){
		 System.out.println("introdusca el numero1");
	        valor=scanner.nextInt();
	  	  System.out.println("introdusca el numero2");
	  	  valor0=scanner.nextInt();   
		 double suma=valor+valor0;
		 System.out.println("resta: "+suma);
		return suma;
		
	}
	Double resta(){
		System.out.println("introdusca el numero1");
        valor=scanner.nextInt();
  	  System.out.println("introdusca el numero2");
  	  valor0=scanner.nextInt();   
  	 double res=valor-valor0;
		System.out.println("resta: "+res);
		return res;
	}
	
	Double multiplicacion(){
		System.out.println("introdusca el numero1");
	    valor=scanner.nextInt();
		  System.out.println("introdusca el numero2");
		  valor0=scanner.nextInt();   
		  double mult=valor+valor0;
			System.out.println("multiplicacion: "+mult);
			return mult;
		
	}
	Double division(){
		System.out.println("introdusca el numero1");
	    valor=scanner.nextInt();
		  System.out.println("introdusca el numero2");
		  valor0=scanner.nextInt();   
		  double div=valor/valor0;
		System.out.println("division: "+div);
		return div;
		
	}
	
	Double modulo() {
		System.out.println("introdusca el numero1");
	    valor=scanner.nextInt();
		  System.out.println("introdusca el numero2");
		  valor0=scanner.nextInt();   
		  double mod=valor%valor0;
		System.out.println("modulo: "+mod);
		return mod;
	}
	
	Double bolaeano() {
		System.out.println("introdusca el numero1");
        valor=scanner.nextInt();
  	  System.out.println("introdusca el numero2");
  	  valor0=scanner.nextInt();   
		boolean comparar=valor>=valor0;
		boolean logica=false;
		if (comparar||logica) {

			System.out.println("hola si soy verdadero");

			System.out.println("comparar "+comparar);
		}else {

			System.out.println(comparar);

			System.out.println(logica);
		}
		return valor;
	}
	
}
