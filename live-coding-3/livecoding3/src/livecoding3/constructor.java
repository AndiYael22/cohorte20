package livecoding3;

public class constructor {
int mangos,naranjas;

public constructor(int mangos, int naranjas) {
	super();
	this.mangos = mangos;
	this.naranjas = naranjas;
}

public int calcularMCD(int mangos,int naranjas){
	
	if(mangos >naranjas) {
		int temporal=mangos;
		mangos=naranjas%mangos;
	}
	return naranjas;
	
}

public int cajas () {
	 int a = Math.max(mangos, naranjas);
     int b = Math.min(mangos, naranjas);

     int resultado = 0;
     do {
         resultado = b;
         b = a % b;
         a = resultado;
     } while (b != 0);

     return resultado;
      
 }

public int mangos() {
	int numMangos=0;
	numMangos=mangos/cajas();
	return numMangos;
}
public int naranjas() {
	int numNaranjas=0;
	numNaranjas=naranjas/cajas();
	return numNaranjas;
}

public void imprimit() {
	int cajas=cajas();
	System.out.println("numero de cajas"+cajas);
	System.out.println("numero de naranjas"+naranjas);
	System.out.println("numero de mangos"+mangos);

}

}
