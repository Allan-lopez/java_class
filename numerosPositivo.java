package tareasJava;

import java.util.Scanner;

public class numerosPositivo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int numero = input.nextInt();
		
		if (numero > 0) {
			System.out.println("El numero es positivo");
		}
		else if (numero < 0) {
			System.out.println("El numero es negativo");
		} else {
			System.out.println("El numero es cero");
		}
	}

}
