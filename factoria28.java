package tareasJava;

import java.util.Scanner;

public class factoria28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int numero;
        int factorial = 1;
        do {
            System.out.println("Ingresa un número: ");
            numero = input.nextInt();
        } while (numero < 0);
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
