package operaciones;

import java.util.Scanner;

public class operacionescondatosususario {

	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		
		int dato1 ;
		double dato2;
		int dato3;
		
		dato1 = 5;
		dato2 = 3.3;
		dato3 = 4;
		
		int numeroSuma1;
		System.out.println("dame un numero: ");
		numeroSuma1 = teclado.nextInt();
		
		int numeroSuma2;
		System.out.println("dame otro numero: ");
		numeroSuma2 = teclado.nextInt();
		
		System.out.println("tu resultado es: " + numeroSuma1 + numeroSuma2);

	}

}
