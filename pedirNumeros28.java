package tareasJava;

import java.util.Scanner;

public class pedirNumeros28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dato;
		
		do {
			System.out.println("Ingresa un numero positivo");
			dato = input.nextInt();
		} while (dato >=0 && dato <=5);
		System.out.println("El número no se ingreso correctamente");
	}

}
