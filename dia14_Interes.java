package ejercicios_Clase;

import java.util.Scanner;

public class dia14_Interes {
	public static double calculaInteresSimple(double monto, double tasaInteres, double tiempo ) {
		double interes = (monto * tasaInteres * tiempo)/100;
		return interes;
		
	}
	
	public static double calculaInteresCompuesto(double monto, double tasaInteres, double tiempo ) {
		double interes = monto * Math.pow (1 + (tasaInteres /100),  tiempo)- monto;
		return interes;
	}

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("¿Cual es el monto de tu inversión ?");
	double monto = input.nextDouble();

	System.out.println("¿Cual es el interes de tu inversión ?");
	double tasaInteres = input.nextDouble();
	
	System.out.println("¿Cual es el tiempo de tu inversión ?");
	double tiempo = input.nextDouble();
	
	if (tasaInteres > 5) { 
		tiempo = 10;
	
	System.out.println("Tu tasa de interes es mayor a 5% por lo que el periodo es a 10 años");
	double interesSimple = calculaInteresSimple(monto, tasaInteres, tiempo);
	System.out.println("Interes Simple: " + interesSimple);	
	double interesCompuesto = calculaInteresCompuesto(monto, tasaInteres, tiempo);
	System.out.println("Interes Compuesto: " + interesCompuesto);
	}
	
	else {
		
		double interesSimple = calculaInteresSimple(monto, tasaInteres, tiempo);
		System.out.println("Interes Simple: " + interesSimple);
		
		double interesCompuesto = calculaInteresCompuesto(monto, tasaInteres, tiempo);
		System.out.println("Interes Compuesto: " + interesCompuesto);
	}
	
	
}
}
