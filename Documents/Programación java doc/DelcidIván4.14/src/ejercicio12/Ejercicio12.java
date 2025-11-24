package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame una distancia en kilometros: ");
		double km= teclado.nextDouble();
		
		
		System.out.println("Tus kilometros en millas son: " + conversionMillas(km));

	}
	public static double conversionMillas(double kilometros) {
		
		double conversion= kilometros*0.62137;
		
		
		return conversion;
	}
	


}
