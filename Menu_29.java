package tareasJava;

import java.util.Scanner;

public class Menu_29 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
System.out.println("Bienvenido al restaurante FUNVAL");
		
		System.out.println("1.- Tacos");
		System.out.println("2.- Pizza");
		System.out.println("3.- Hambuerguesa");
		System.out.println("4.- Quesadillas");
		System.out.println("5.- Torta");
		
		System.out.println("Por favor seleccione una operacion");
		
		int opcion =input.nextInt();
		
		switch(opcion){
			
		case 1:
			tacos();
			break;
		case 2:
			pizzas();
			break;
		case 3:
			hamburguesas();
			break;
		case 4:
			quesadillas();
			break;
		case 5:
			tortas();
			break;
			
		default:
			System.out.println("No estas ingresando un valor no valido");
			break;	
		}
		
	}
	static void tacos() {
		System.out.println("Usted selecciono tacos");
		
	}
	static void pizzas() {
		System.out.println("Usted selecciono pizzas");
		
	}
	static void hamburguesas() {
		System.out.println("Usted selecciono hamburguesas");
		
	}
	static void quesadillas() {
		System.out.println("Usted selecciono quesadillas");
		
	}
	static void tortas() {
		System.out.println("Usted selecciono tortas");
	}

}
