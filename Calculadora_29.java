package tareasJava;

import java.util.Scanner;

public class Calculadora_29 {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		System.out.println("Bienvenido a la calculadora");
		
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicacion");
		System.out.println("4.- Division");
		
		
		System.out.println("Por favor seleccione una operacion");
		
		int opcion =input.nextInt();
		
		switch(opcion){
			
		case 1:
			suma();
			break;
		case 2:
			resta();
			break;
		case 3:
			multiplicacion();
			break;
		case 4:
			division();
			break;
		default:
			System.out.println("No estas ingresando un valor no valido");
			break;	
		}
		
	}
	static void suma() {
		System.out.println("Usted selecciono una SUMA");
		System.out.println("Ingrese el primer numero");
		float numero1 = input.nextFloat();
		System.out.println("Ingrese el segundo numero");
		float numero2 = input.nextFloat();
		float resultado = numero1 + numero2;
		System.out.println("El resultado de tu suma es igual a: " + resultado);
		
	}
	static void resta() {
		System.out.println("Usted selecciono una RESTA");
		System.out.println("Ingrese el primer numero");
		float numero1 = input.nextFloat();
		System.out.println("Ingrese el segundo numero");
		float numero2 = input.nextFloat();
		float resultado = numero1 - numero2;
		System.out.println("El resultado de tu resta es igual a: " + resultado);
		
	}
	static void multiplicacion() {
		System.out.println("Usted selecciono una MULTIPLICACION");
		System.out.println("Ingrese el primer numero");
		float numero1 = input.nextFloat();
		System.out.println("Ingrese el segundo numero");
		float numero2 = input.nextFloat();
		float resultado = numero1 * numero2;
		System.out.println("El resultado de tu multiplicacion es igual a: " + resultado);
		
	}
	static void division() {
		System.out.println("Usted selecciono una DIVISION");
		System.out.println("Ingrese el primer numero");
		float numero1 = input.nextFloat();
		System.out.println("Ingrese el segundo numero");
		float numero2 = input.nextFloat();
		float resultado = numero1 / numero2;
		System.out.println("El resultado de tu division es igual a: " + resultado);
		
	}
}
