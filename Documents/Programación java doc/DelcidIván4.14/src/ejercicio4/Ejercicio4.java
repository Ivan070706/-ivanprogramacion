package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Dame un numero:");
		int num= teclado.nextInt();
		
		System.out.println(dimeSigno(num));

	}
      public static int dimeSigno(int a) {
    	 if (a==0) {
    		return 0;
    	 }if (a<0) {
    		 return -1;
    	 }else {
    		 return 1;
    	 }
    	  
    	  
    	  
      }
}
