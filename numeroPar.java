package tareasJava;

import java.util.Scanner;

public class numeroPar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int numero = input.nextInt();
		
		if (numero % 2  == 0){
			System.out.println("El numero es par");
		}
		else if (numero % 2 !=0) {
			System.out.println("El numero es inpar");
		
		
		}
	}

}
