package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		 Scanner teclado= new Scanner (System.in);
		int numeroReintentos=0;
		int numeroAl = (int)(Math.random()*50);
		
		do {
			System.out.println("Intenta adivinar el numero secreto entre el 0 y el 50: ");
			int numero= teclado.nextInt();
			if (numero == numeroAl) {
				System.out.println("Enhorabuena has acertado el numero bien hecho");
			}if(numero!=numeroAl) {
				System.out.println("Fallaste, sigue buscando.");
			}
			if (numero<numeroAl) {
				System.out.println("mayor");
			}if (numero>numeroAl){
				System.out.println("menor");
		
			}else {
				System.out.println(" prueba con otro numero");
				int numeroReintento= teclado.nextInt();
			
			}
		}while(numeroReintentos>=0 && numeroReintentos<= 50) ;
	}
}


