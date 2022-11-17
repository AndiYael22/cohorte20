package operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner =new Scanner(System.in);

    //System.out.println("----da un dato-----");
	//String dato=scanner.nextLine();
	//System.out.println("el dato es"+dato);
	/*

	System.out.println("valor1");
    int	 valor=scanner.nextInt();
	 System.out.println("valor2");
	 int valor0=scanner.nextInt();
	int suma=valor+valor0, res=valor-valor0,mult=valor+valor0, div=valor/valor0, mod=valor%valor0;
	System.out.println("suma: "+ suma);
	System.out.println("resta: "+ res);
	System.out.println("multiplicacion: "+ mult);
	System.out.println("division: "+ div);
	System.out.println("residuo de la division: "+ mod);
	
	if(mod==0) {
		System.out.println("el numero es par");
	}else {
		System.out.println("el numero no es par");
	}
	int a=3,b=5;
	boolean comparar=a>=b;
	boolean logica=false;
	if (comparar||logica) {

		System.out.println("hola si soy verdadero");

		System.out.println("comparar"+comparar);
	}else {

		System.out.println(comparar);

		System.out.println(logica);
	}
	*/
    int valor,valor0, numero;	
	  do{
		

	      System.out.println("1-suma \n"
	      		+ "2-resta \n"
	      		+ "3-multiplicacion\n"
	      		+ "4-division \n"
	      		+ "5-modulo\n"
	      		+ "6-boleanos\n"
	      		+ "7-salir"
	      		);

	        System.out.println("elija una operacion");
	  	  numero=scanner.nextInt();
		  	;

	  switch(numero) {

	  case 1:
		  System.out.println("introdusca el numero1");
	        valor=scanner.nextInt();
	  	  System.out.println("introdusca el numero2");
	  	  valor0=scanner.nextInt();   
		  int suma=valor+valor0;
		System.out.println("suma: "+suma);
		break;
	case 2:
		System.out.println("introdusca el numero1");
        valor=scanner.nextInt();
  	  System.out.println("introdusca el numero2");
  	  valor0=scanner.nextInt();   
		int res=valor-valor0;
		System.out.println("resta: "+res);
		break;
	case 3:
		System.out.println("introdusca el numero1");
    valor=scanner.nextInt();
	  System.out.println("introdusca el numero2");
	  valor0=scanner.nextInt();   
		int mult=valor+valor0;
		System.out.println("multiplicacion: "+mult);
		break;
	case 4:
		System.out.println("introdusca el numero1");
	    valor=scanner.nextInt();
		  System.out.println("introdusca el numero2");
		  valor0=scanner.nextInt();   
		int div=valor/valor0;
		System.out.println("division: "+div);
		break;
	case 5:
		System.out.println("introdusca el numero1");
	    valor=scanner.nextInt();
		  System.out.println("introdusca el numero2");
		  valor0=scanner.nextInt();   
		int mod=valor%valor0;
		System.out.println("modulo: "+mod);
		break;
	case 6:
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
		break;
	  }}
	  while(numero!=7);
	  }}
	  
	


