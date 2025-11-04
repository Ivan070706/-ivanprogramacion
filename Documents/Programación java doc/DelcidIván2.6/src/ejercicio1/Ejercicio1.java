package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
			int num1;
			System.out.println("Dame un numero ");  //Pedimos el primer numero 
		     num1 = teclado.nextInt();
		     
		     int num2;
		     System.out.println("Dame otro numero"); // pedimos el segundo 
		     num2 = teclado.nextInt();
	  
		     if (num1 > num2) {                                      //comprobación de cual es mayor y menor 
		    	 System.out.println("el numero menor es: " + num2);
		    	 
		     }else if (num2 > num1) {
		    	 System.out.println("el numero mayor es: " + num2 );
		    	 	 
		     }else { 
		    	 System.out.println("Ambos tienen el mismo valor");
		     }

	}

}
