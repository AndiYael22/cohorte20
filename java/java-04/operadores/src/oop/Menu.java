package oop;

import java.util.Scanner;

public class Menu {

	int menuOP(){
		 Scanner scanner =new Scanner(System.in);
	int numero=0;
			

		      System.out.println("Menu principal\n"
		      		+ "1-tablas de multiplicar \n"
		      		+ "2-operaciones aritmeticas\n"
		      
		      		);

		        System.out.println("elija una operacion");
		  	 return  numero=scanner.nextInt();
}
	
	int submenuOP(){
		 Scanner scanner =new Scanner(System.in);
	int numero=0;
			

		      System.out.println("Operaciones aritmeticas\n"
		      		+ "1-suma \n"
		      		+ "2-resta \n"
		      		+ "3-multiplicacion\n"
		      		+ "4-division \n"
		      		+ "5-modulo\n"
		      		+ "6-boleanos\n"
		      		+ "7-salir"
		      		);

		        System.out.println("elija una operacion");
		       
		  	 return  numero=scanner.nextInt();
			  	

		  


}
	


}
		  