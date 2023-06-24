package ejercicios_Clase;

import java.util.Scanner;

public class dia15_Nomina {
	
	public static double calcularSueldo (double horasN, double horasExtras){
		double sueldo = (horasN * 72.87 + horasExtras * 25.96);
		return sueldo;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("¿Cual es su nombre?");
		String nombre = input.next();
		
		System.out.println("¿Cual es su área?");
		String area = input.next();
		
		System.out.println("¿Ingresa las horas laboradas?");
		double horasN = input.nextDouble();
		System.out.println("¿Ingresa las horas extras laboradas?");
		double horasExtras = input.nextDouble();
		
		double sueldoCalculado= calcularSueldo(horasN, horasExtras);
		if (sueldoCalculado >=2000) {
		double sueldoNeto = (sueldoCalculado *0.82);
		System.out.println("Hola:" + nombre + "Tu area es " + area);
		System.out.println("Tu sueldo despues de impuestos es de:"  + sueldoNeto);
		}
		else {
		double	sueldoNeto = (sueldoCalculado * 0.84);	
		System.out.println("Hola:" + nombre + "Tu area es " + area);
		System.out.println("Tu sueldo despues de impuestos es de:"  + sueldoNeto);
		}
		
	

	}
	
}
