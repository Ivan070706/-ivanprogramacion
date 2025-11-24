package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Dame las millas de tu ultima ruta: ");
		int  kilometros= teclado.nextInt();
		
		System.out.println("Tu ultima ruta en kilometros fue: "+ millas_a_kilometros(kilometros));
		System.out.println(millas_a_kilometros(kilometros));
		

	}
		public static double millas_a_kilometros(int millas) {
			double calculo=millas * 1.60934;
			return calculo;
		}
}
