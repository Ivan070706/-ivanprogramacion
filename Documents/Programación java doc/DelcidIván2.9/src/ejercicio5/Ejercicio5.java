package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Dame un numer para ver su factorial: ");
		int n = teclado.nextInt();
		
		if (n<0) {
			System.out.println("Error.El numero debe ser positivo.");
		}else {
			long factorial=1;
			
			for(int numero=1; numero<=0; numero++) {
				factorial=n;
			}
			 System.out.println("El numero " + n + " tiene como factorial: "+ factorial);
		}
     
	}

}
