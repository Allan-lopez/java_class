package tareasJava;

import java.util.Scanner;

public class sumar_Numero28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Cuantos numeros quiere ingresar");
		int cantidad = input.nextInt();
		int suma=0;
		int i=1;
		while (i <= cantidad) {
		Scanner input2 = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		int n = input2.nextInt();
		suma += n;
		i++;	
		}
		System.out.println("La suma de tus numeros es " + suma);
	}

}
