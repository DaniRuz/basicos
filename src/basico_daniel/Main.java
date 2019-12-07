package basico_daniel;

public class Main {

	public static void main(String[] args) {
		

		numericos();
		cadenas();
		logicos();
		
	}
	
	public static void numericos() {
		
		
		//Declaraci�n de variables
		
		byte elMasPeque;
	    short chiquitin;
	    int entero;
	    long duplicaEntero;
	    float grande;
	    double doble;
	    
	    //Asignar valores
	    
	    elMasPeque = 8;
	    chiquitin = 20;
	    entero = 100;
	    duplicaEntero = 1000;
	    grande = 34.45f;
	    doble = 23.35295;
	    
	    //Mostrar variables
	    
	    System.out.println("Valor byte");
	    System.out.println(elMasPeque);
	    System.out.println("valor short");
	    System.out.println(chiquitin);
	    System.out.println("Valor entero");
	    System.out.println(entero);
	    System.out.println("Valor long");
	    System.out.println(duplicaEntero);
	    System.out.println("valor float");
	    System.out.println(grande);
	    System.out.println("valor double");
	    System.out.println(doble);
	    
	    }

		
	
	public static void cadenas() {
		String texto;
		texto = "Hola mundo";
		System.out.println("-------------------");
		System.out.println(texto);
	}


		
	
	
	public static void logicos() {
		
		//zona de declaraci�n de variables
		int numero1;
		int numero2;
		
		//zona de inicializaci�n de variables
		numero1 = 7;
		numero2 = 7;
		
		//mostrar por pantalla el resultado
		System.out.println("-------------------");
		System.out.println(numero1+" Es mayor que "+numero2+"?");
		
		if(numero1>numero2) {
			System.out.println("Verdadero");
		}else {
			System.out.println("Falso");
		}
		System.out.println();
		
		System.out.println(numero1+" Es menor que "+numero2+"?");
		
		if(numero1<numero2) {
			System.out.println("Verdadero");
		}else {
			System.out.println("Falso");
		}
		System.out.println();
		
		System.out.println(numero1+" Es igual que "+numero2+"?");
		
		if(numero1==numero2) {
			System.out.println("Verdadero");
		}else {
			System.out.println("Falso");
		}
		System.out.println();
		
		System.out.println(numero1+" Es distinto que "+numero2+"?");
		
		if(numero1!=numero2) {
			System.out.println("Verdadero");
		}else {
			System.out.println("Falso");
		}
		System.out.println();
		
	}

}
