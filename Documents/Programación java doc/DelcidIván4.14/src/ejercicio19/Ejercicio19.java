package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame un valor x: ");
		int x=teclado.nextInt();
		
		System.out.println("Dame un valor y: ");
		int y = teclado.nextInt();
		
		System.out.println("Dame un valor z: ");
		int z=teclado.nextInt();
         
		
		System.out.println(comprobacionEcuacion(x,y,z));
	}
	//Vamos a comprobar si la ecuacion funciona con los numeros dados por el usuario
	public static boolean comprobacionEcuacion(int x,int y, int z) {
		if ((x*x)+(y*y)==(z*z)) {
			return true;
		}else {
			return false;
		}
		
	}
	

}
