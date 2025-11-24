package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.println("Dame un numero y te daré su tabla de multiplicar:");
		int numero= teclado.nextInt();
		
		System.out.println(tablaMultiplicar(numero));

	}
	//Con un numero dado por el usuario le daremos su tabla de multiplicar
	public static int tablaMultiplicar(int numero) {
		int []num=new int [10];
		for (int i=0;i<10;i++) {
		 num[i]=numero*(i+1);
		}
		
		  System.out.println("La tabla de " + numero + " es:");
		    for (int i = 0; i < 10; i++) {
		        System.out.println(numero + " x " + (i + 1) + " = " + num[i]);
		    }

		
		return 0;
	}

}
