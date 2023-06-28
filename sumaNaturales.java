package tareasJava;

public class sumaNaturales {

	public static void main(String[] args) {
		int suma=0, numero[]= new int [100];
		
		for (int i=0; i<=100; i++) {
			suma =suma+i;
		}
		System.out.println("La suma de los primeros 100 numeros es: " + suma);
	}

}
