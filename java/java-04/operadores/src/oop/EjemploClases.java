package oop;

public class EjemploClases {

	
	static void cambio()
	{
	
Tablas t=new Tablas();
Menu u=new Menu();
OperacionesAritmeticas x=new OperacionesAritmeticas();
Submarino sm=new Submarino();
int opcionm=u.menuOP();
int numero=u.menuOP();

do {
switch (opcionm) {
case 1:{
	t.tabla();
	break;
}
case 2:{
sm.submenu();
	break;
	
}
default:
}
	}while(opcionm!=3); 
		}
	
		
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
cambio();

}
}