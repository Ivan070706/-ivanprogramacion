package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int opcion = 0;
		do {
			int opcion1 = menu();
			 switch(opcion1) {
			 
			 case 1: 
				double r1= pideRadio();
				 System.out.println("Circunferencia= " + circunferencia(r1));
				 break;
			 case 2: double r2= pideRadio();
			 System.out.println("Área= " + area(r2));
			 break;
			 case 3: 
				 double r3= pideRadio();
				 System.out.println("Volumen= " + volumen(r3));
				 break;
			 case 4: 
				 double r4= pideRadio();
				 System.out.println("Circunferencia= " + circunferencia(r4));
				 System.out.println("Área= " + area(r4));
				 System.out.println("Volumen= " + volumen(r4));
				 break;
			 case 5:
				 System.out.println("Fuera del programa.");
				 break;
				 default: System.out.println("Opcion no valida.");
			 }
			 
		}while(opcion!=5);
        
	}
	public static int menu () {
		Scanner teclado = new Scanner (System.in);
		System.out.println("======Menú======");
		System.out.println("(1).Circunferencia");
		System.out.println("(2).Área");
		System.out.println("(3).Volumen");
		System.out.println("(4). Todo");
		System.out.println("(5).Salir");
		System.out.println("Elige una opcion: ");
		
		return teclado.nextInt();
}
	// pide el  radio 
	public static double pideRadio() {
		Scanner teclado = new Scanner (System.in);
		    System.out.println("Dame el radio: ");
			double radio=teclado.nextDouble();
		return radio;
	}
	// calcula la circunferencia y la devuelve
	public static double circunferencia(double r) {
		double circunferencia= (2*r)*Math.PI;
		return circunferencia;
	}
	// calculo del aera y lo devuelve
	public static double area(double r) {
		double area= Math.PI*(r*r);
		return area;
	}
	// calculo del volumen y lo devuelve
	public static double volumen(double r) {
		double volumen = ((4/3)*Math.PI)*(r*r*r);
		return volumen;
	}

}
