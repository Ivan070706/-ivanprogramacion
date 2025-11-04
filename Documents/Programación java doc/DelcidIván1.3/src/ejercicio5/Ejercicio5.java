package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
			
		
		int num1;
		System.out.println("Dame un numero ");
	     num1 = teclado.nextInt();
	     
	     int num2;
	     System.out.println("Dame otro numero");
	     num2 = teclado.nextInt();
  
	     if (num1 > num2) {
	    	 System.out.println("el numero menor es: " + num2);
	    	 
	     }else if (num2 > num1) {
	    	 System.out.println("el numero mayor es: " + num2 );
	    	 	 
	     }else { 
	    	 System.out.println("Ambos tienen el mismo valor");
	     }
	     int potencia = (num1 * num2);
	     System.out.println("El resultado de la potencia es: " + potencia);
	     
	     double raiz = Math.sqrt (num1);
	     System.out.println("El resultado de la raiz del primer número es: " + raiz);
	     
	     double raiz2 = Math.sqrt (num2);
	     System.out.println("El resultado de la raiz del segundo número es: " + raiz2);
	     
	     
	}
	

}
