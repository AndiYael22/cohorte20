package oop;

public class Submarino {
	 void submenu(){
	
		Menu m= new Menu();
		OperacionesAritmeticas oa= new OperacionesAritmeticas();
		 int opcion=m.submenuOP();
		  do { 
			  switch(opcion) {
			  case 1:{
			  	System.out.println("suma "+ oa.suma());
			  	break;
			  }
			  case 2:{
			  	System.out.println("resta "+ oa.resta());
			  	break;

			  }case 3:
			  {
			  	System.out.println("multiplicacion"+ oa.multiplicacion());
			  	break;

			  }case 4:
			  {
			  	System.out.println("division"+oa.division());
			  	break;

			  }
			  case 5:
			  {
			  	System.out.println("modulo"+ oa.modulo());
			  	break;

			  }case 6:
			  {
			  	System.out.println("boleano"+ oa.bolaeano());
			  	break;

			  }
			  		
			  }} 
	while(opcion!=7);	  
	}}		  
		 

		

