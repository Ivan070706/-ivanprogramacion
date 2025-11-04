package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);

		int edad;
		System.out.println("Dame tu edad: ");
		edad = teclado.nextInt();
		
		if (edad <= 18) {
			System.out.println("Inválido");
		}else {
			System.out.println("Válido");
			
			String nombre;
			System.out.println("Dame tu nombre: ");
			nombre = teclado.nextLine();
			
			String apellido;
			System.out.println("Dame tu apellido: ");
			apellido = teclado.nextLine();
			
			System.out.println("Nombre " + nombre);
			System.out.println("Apellido " + apellido);
			System.out.println("Edad " + edad);
			System.out.println("Usted ha sido admitido");
		}
	}

}
