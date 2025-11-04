package cadenasCaracteres;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println(" Vamos a ver tu IMC, pero necesito estos datos antes.");
		System.out.println("Dime tu altura: ");
		double altura= teclado.nextDouble();
		System.out.println("Dime tu peso: ");
	    double peso= teclado.nextDouble();
	    
	    double imc= peso/(altura*altura);
	    System.out.println("-----RESULTADO-----");
	    System.out.printf("IMC: %.3f", imc);
		

	}

}
