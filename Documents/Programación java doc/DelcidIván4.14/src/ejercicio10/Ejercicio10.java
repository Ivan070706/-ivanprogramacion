package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime tu dia de nacimiento: ");
		int dia= teclado.nextInt();
		
		System.out.println("Dime el mes en el que naciste: ");
		int mes=teclado.nextInt();
		
		System.out.println("Dime el año en el que naciste: ");
		int anyo=teclado.nextInt();
		  
		
		System.out.println(validacionFecha(dia,mes,anyo));

	}
	public static boolean validacionFecha (int dia , int mes , int anyo) {
	   switch(mes) {
	   case 4,6,9,11:{
		   if(dia<=30 && dia>0) {
			   return true;
		   }else {
			   return false;
		   }
	   }
	   case 1,3,5,7,8,10,12:{
		   if (dia<=31 && dia>0) {
			   return true;
		   }else {
			   return false;
		   }
	   }
	   case 2:{
		   if(dia<=28 && dia>0) {
			   return true;
		   }else {
			   return false;
		   }
	   }
	   }
		return false;
		
		
	}

}
