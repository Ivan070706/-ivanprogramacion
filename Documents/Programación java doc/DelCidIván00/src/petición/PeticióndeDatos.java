package petición;

import java.util.Scanner;

public class PeticióndeDatos {

	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		
		int edadAlumno;
		System.out.print("Dame tu edad:");
		edadAlumno = teclado.nextInt();
		System.out.println("Tu edad es: " + edadAlumno);
		
		teclado.nextLine();// Después de pedir valor numerico y antes de pedir cadena de caracteres
		String nombreAlumno;
		System.out.println("Dame tu nombre:" );
		nombreAlumno = teclado.nextLine();
		System.out.println("Tu nombre es: " + nombreAlumno);
		
		
		double pesoAlumno;
		System.out.println("Dame tu peso: ");
		pesoAlumno = teclado.nextDouble();
		System.out.println("Tu peso es: " + pesoAlumno);
		
		

	}

}
