package ifmodel;

import java.util.Scanner;

public class Ifmodel {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		 int num1;
		 System.out.println("Dame un número: ");
		 num1 = teclado.nextInt();
		 
		 if (num1 > 0) {
			 System.out.println("Positivo");  // el numero es positivo
			 if (num1 > 50) {
				 System.out.println("Mayor de 50");
			 }
		 } else                                 //no es positivo puede ser 0 o negativo 
		 if (num1 == 0) {
			 System.out.println("Cero");
		 }
		 else{
			 System.out.println("Negativo");
		 }
		 

	}

}
