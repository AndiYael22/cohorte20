package coleccones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
public static void main (String[] args) {
	//list - ArrayList
	//Valores de un mismo tipo
	//<>
	System.out.println("----ArrayList----");
	
	List<String> miArray=new ArrayList<String>();
	miArray.add("gdl");
	miArray.add("cdmx");
	miArray.add("mty");
	miArray.add(2,"Manzanillo");
	String valorQuitado=miArray.remove(0);
	//boolean valorQuitado=miArrt.remove("GDLx");
	System.out.println(miArray);
	System.out.println("el valor removido es "+valorQuitado);
	System.out.println("aqui toy "+miArray.get(0));
	System.out.println(miArray.size());

imprimir(miArray);


System.out.println("----HashSet----" );

//es la mas rapida de todas
//no permite lementos duplicados
//no guarda elementos en un orden aparente
//no maneja indice
Set<String> miSet=new HashSet<String>();


miSet.add("Pamnchito");
miSet.add("Paco");
miSet.add("Juan");
miSet.add("Juan");
miSet.add("Martin");

System.out.println(miSet);
System.out.println(miSet.contains("Martin"));
miSet.remove("Martin");
imprimir(miSet);

System.out.println("----HashMap----" );
Map<String, Integer> miMap=new HashMap<String,Integer>();
//llave -- valor las llaves no se pueden duplicar(si se hace se remplazan valores) los valores si
miMap.put("valor1 ", 56);
miMap.put("valor2 ", 5);
miMap.put("valor1 ", 70);
System.out.println(miMap	);
System.out.println(miMap.get("valor2 ")	);
System.out.println(miMap.keySet()	);

for(String llave : miMap.keySet()) {
	System.out.println(llave + " : " + miMap.get(llave));
}

}

public static void imprimir(Collection coleccion) {
	for(Object elemento : coleccion ) {
		System.out.println("Elemento = " + elemento);
	}
}


}
