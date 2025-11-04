/*
 * Descripción: Ejercicio 1 examen tema 1
 * Autor:Iván del cid plaza
 * Fecha:29/10/2025
 */

package delcid1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
			Scanner teclado= new Scanner(System.in);
			                                     // Declaramos variables
			int elegibleParaBono=0;
			int numeroEmpleado=2055;
			int edad=35;
			double salarioHora=15.50;
			 System.out.println("Número de horas trabajadas a la semana: ");
			 int horasSemana = teclado.nextInt();
			 
			 double salarioBruto= salarioHora*horasSemana;// calculos variables
			  double irpf=15.50*100;
			  double irpfRetenido=irpf/salarioBruto;
			  double salarioNeto=irpf-salarioBruto;
			  // impresion en consola de lo pedido por el ejercicio
				  System.out.println("El numero de empleado: " + numeroEmpleado + " y su edad:  " + edad);
				  System.out.println("El salario hora: " + salarioHora);
				  System.out.println("El salario bruto semanal: " + salarioBruto);
				  System.out.println("El importe de IRPF retenido: " + irpfRetenido);
				  System.out.println("El salario neto " + salarioNeto);
				  System.out.println("El estado de Elegibilidad para bono: " + elegibleParaBono);
				  if   (horasSemana>=39) {// usamos un if para saber si la variable es positiva o negativa
					  System.out.println("Positivo");
				  }else {
					  System.out.println("Negativo");
				  
			  }
			}



		

	}


