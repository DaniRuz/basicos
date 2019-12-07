package basico_daniel;

public class Main {

	public static void main(String[] args) {
		
		logicos();
	}
	
	public static void logicos() {
		
		//zona de declaración de variables
		int numero1;
		int numero2;
		
		//zona de inicialización de variables
		numero1 = 7;
		numero2 = 7;
		
		//mostrar por pantalla el resultado
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
