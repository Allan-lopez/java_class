package ejercicios_Clase;

import java.util.Scanner;

public class añoBisiesto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un año");
		
		int año = input.nextInt();
		if (año % 4 == 0 && año % 100 != 0){
			
					System.out.println("El año es bisiesto");
				
		} 
		else {
			System.out.println("El año no es bisiesto"); 
		}
		

	}

}
