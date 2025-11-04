package cadenacaracteres;

import java.util.Scanner;

public class Operacionescadena {

	public static void main(String[] args) {
		
	Scanner teclado= new Scanner (System.in);
	
	String cadena;
	System.out.println("Dame una cadena de caracteres");
	cadena = teclado.nextLine();
	
	// mostrar la longitud de la cadena 
	
	String numerocaracteres = cadena;
	int longitud = cadena.length ();
	  System.out.println("La cantidad de caracteres es: " + longitud);
	// mostrar el primer caracter de la cadena 
	  char primeraLetra = cadena.charAt (0);
	  System.out.println("la primera letra es: "+ primeraLetra);
	// mostrar el ultimo caracter de la cadena 
	char ultimaLetra = cadena.charAt(longitud - 1);
	System.out.println("la ultima letra es: " + ultimaLetra);
	// mostrar la segunda palabra de la cadena
	String[] palabras = cadena.split(" ");
			String segundaPalabra = palabras[1];
	System.out.println("la segunda palabra es: " + segundaPalabra);
	// mostrar la cadena con la priemera letra y la ultima en mayúscula
	String primLetra = cadena.substring(0,1);
	primLetra = primLetra.toUpperCase();
	
	String ultLetra= cadena.substring(longitud -1, longitud);
	ultLetra= ultLetra.toUpperCase();
	
	String medio = cadena.substring(1,longitud-1);
	System.out.println(primLetra + medio + ultLetra);
	
	}

	private static void toUppercase(char primeraLetra, char ultimaLetra) {
		// TODO Auto-generated method stub
		
	}

}
