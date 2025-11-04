package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame tu nombre");
		String nombre = teclado.nextLine();
		
		System.out.println("Dame tu apellido");
		String apellido = teclado.nextLine();
		
		System.out.println("Dame tu edad");
		int edad = teclado.nextInt();
		
		System.out.println("Dame tu salario deseado");
		int salarioDeseado = teclado.nextInt();
		
		if (salarioDeseado > 30000 || edad > 45) {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
		}
		
		System.out.println("Dame tus años de experiencia");
		int anyosExperiencia = teclado.nextInt();
		
		System.out.println("Dime la cantidad de tus proyectos trabajados");
		int cantidadProyectos = teclado.nextInt();
		
		if (anyosExperiencia >2 && cantidadProyectos>3 ) {
			System.out.println("Enhorabuena. Ha sido contratado");
		}else {
			
		}

	}

}
