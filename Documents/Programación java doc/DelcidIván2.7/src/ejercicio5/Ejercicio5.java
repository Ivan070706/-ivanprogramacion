package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el valor 1: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduzca el valor 2: ");
		int num2 = teclado.nextInt();
		
		System.out.println("Indique la operación que quiere realizar (Inserte un número): " );
		
		
		System.out.println("(1)  Suma");
		System.out.println("(2)  Resta");
		System.out.println("(3)  Multiplicación");
		System.out.println("(4)  División");
		int seleccion = teclado.nextInt();
		
		switch (seleccion) {
		case 1:
			int suma = (num1 + num2);
			System.out.println("Resultado: " + suma);
			break;
		case 2: 
			int resta = (num1 - num2);
			System.out.println("Resultado: " + resta);
			break;
		case 3:
			int multiplicacion = (num1 * num2);
			System.out.println("Resultado: " + multiplicacion);
			break;
		case 4: 
			int division = (num1 / num2);
			System.out.println("Resultado: " + division);
			break;
			default:
				System.out.println("Selección erronea");
			
			
			
			
			
		}
			
			
		
	}

}
