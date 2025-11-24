package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
     System.out.println("Introduce un numero: ");
     int num1=teclado.nextInt();
     
     System.out.println("Introduce el segundo numero: ");
     int num2= teclado.nextInt();
     
     System.out.println(minimo(num1,num2));
     
	}
    public static int minimo(int a, int b) {
    	if (a<b) {
    		return a;
    	}else {
    		return b;
    	}
    	
    	
    }
}
