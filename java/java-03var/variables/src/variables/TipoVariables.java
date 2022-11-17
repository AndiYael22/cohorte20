package variables;

public class TipoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Byte numeroB=12 ;
    System.out.println(numeroB);
    System.out.println("tamaño de un byte "+Byte.SIZE);
    System.out.println("valor maximo " +Byte.MAX_VALUE);
    System.out.println("valor minimo "+Byte.MIN_VALUE);
    
    System.out.println("-------entero-----------");
    int entero=2147483647;
    System.out.println("tamaño del entero "+Integer.BYTES);
    System.out.println("tamaño "+Integer.SIZE);
    System.out.println("valor maximo "+Integer.MAX_VALUE);
    System.out.println("valor minimo "+Integer.MIN_VALUE);
     System.out.println(entero);
     System.out.println("------short---------");
     System.out.println("tamaño de bytes de un short "+Short.BYTES);
     System.out.println("tamaño "+Short.SIZE);
     System.out.println("valor maximo "+Short.MAX_VALUE);
     System.out.println("valor minimi "+Short.MIN_VALUE);
     System.out.println("------long---------");
     System.out.println("tamaño de bytes de un long "+Long.BYTES);
     System.out.println("tamaño "+Long.SIZE);
     System.out.println("valor maximo "+Long.MAX_VALUE);
     System.out.println("valor minimi "+Long.MIN_VALUE);
	
     
     var sisNum=0XFC;
     System.out.println("----"+sisNum);
     
     System.out.println("------------float-------------");
     System.out.println("-----primitivos floar Float, double, Double----------");
     System.out.println("tamaño de  bytes en un float "+Float.BYTES);
     System.out.println("tamaño "+Float.SIZE);
     System.out.println("valor maxim o"+Float.MAX_VALUE);
     System.out.println("valor minimi "+Float.MIN_VALUE);
     float comaF=100.10F;
     System.out.println("----float "+ comaF );

     System.out.println("------------Double-------------");
     System.out.println("tamaño de  bytes en double "+Double.BYTES);
     System.out.println("tamaño "+Double.SIZE);
     System.out.println("valor maxim o"+Double.MAX_VALUE);
     System.out.println("valor minimi "+Double.MIN_VALUE);
	
	
     var comaD=1000.10E23;
     System.out.println("----double "+ comaD );
     System.out.println("--------boolean---------");
     boolean estado=false;
     
     System.out.println("----: "+ estado );
     System.out.println("----Boolean false"+ Boolean.FALSE);

     System.out.println("----Boolean true"+ Boolean.TRUE);

	if (estado) {

	     System.out.println("soy verdaderi");
	}else {

	     System.out.println("soy falso");
		
	}
	var edad=2;
	if (edad>=10) {

	     System.out.println("la edad es mayor o igual a "+edad);
	}else {

	     System.out.println("la edad es menor a "+edad);
		
	}
	
	
	}

}
