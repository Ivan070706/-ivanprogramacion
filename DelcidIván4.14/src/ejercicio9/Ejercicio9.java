package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Dame un valor: ");
		int num1=teclado.nextInt();
		
		System.out.println("Dame el segundo valor: ");
		int num2= teclado.nextInt();
		
		System.out.println("Dame el tercer valor: ");
		int num3= teclado.nextInt();
		
		
		
		System.out.println("El numero mas alto de los tres es: " + numeroMasalto(num1,num2, num3));
		System.out.println("El numero mas bajo de los tres es: " + numeroMasbajo(num1, num2, num3));
	}
	public static int numeroMasalto(int n,int a, int b) {
		int max=n;
		if (n>max) {
			return n;
	}
		return max;
	}
	public static int numeroMasbajo(int n , int a , int b) {
		int min=n;
		if (n<min) {
			return min;
		}
		
		return min;
	}
}
