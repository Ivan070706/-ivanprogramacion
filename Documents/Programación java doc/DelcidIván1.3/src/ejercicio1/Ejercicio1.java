package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
	
		String nombre;
		 System.out.println("Dime tu nombre: ");
		 nombre = teclado.nextLine();
		 
		 String apellidos;
		 System.out.println("Dime tus apellidos: ");
		 apellidos = teclado.nextLine();
		 
		 String fechaNacimiento;
		 System.out.println("Dime tu fecha de nacimiento: ");
		 fechaNacimiento = teclado.nextLine();
		 
		 double salarioBruto;
		System.out.println("Salario Bruto: ");
		salarioBruto = teclado.nextDouble();
		 
		  int  anyosTrabajados;
		 System.out.println("Años trabajados: ");
		 anyosTrabajados = teclado.nextInt();
		 
		 double porcientoSalario = 15;
		 salarioBruto  %= porcientoSalario;
		 
		 double salarioFinal = (salarioBruto -= porcientoSalario);
		 salarioBruto -= porcientoSalario;
		 System.out.println(salarioFinal);
		 
		 System.out.println("Estimad@ " + nombre);
		 System.out.print(" ,su salario bruto es " + salarioBruto);
		 System.out.print(" teniendo en cuenta un IRPF del 15% su salario neto es " + salarioFinal);
		 
		 
		 System.out.print("Debido a sus " + anyosTrabajados);
		 System.out.print("años trabajando en la empresa su salario se incrementará en un 2% por cada año. El aumento es de" + salarioBruto);
		 System.out.print(" y el salario total es " + salarioFinal);
		 
		 
		 

	}

}
