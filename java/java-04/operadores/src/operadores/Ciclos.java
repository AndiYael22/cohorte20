package operadores;

import java.util.Scanner;

public class Ciclos {
	void saludo() {
		System.out.println();
	}
	
	int operacion() {
		int f=(int)Math.pow(3, 2);
				System.out.println(""+f);
		return 0;
	}
	
	static float nuevo() {
		return 0;
	}
	String caracteres() {
		String nombre ="";
		return nombre;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ciclos objC;
		objC=new Ciclos();
		objC.saludo();
     System.out.println("fincion pow"+objC.operacion());
		nuevo();
		Scanner scanner =new Scanner(System.in);

		System.out.println("que tabla desea ver ");
		int tabla=scanner.nextInt();

for(int i =1; i<=10; i++ ) {
	System.out.println(tabla+"+"+i+"="+tabla*i);
}
int j=1;
System.out.println("que tabla desea ver ");
int tablaw=scanner.nextInt();

while(j<=10){

	System.out.println(tablaw+"+"+j+"="+tablaw*j);	
	j++;
}

	}

}
