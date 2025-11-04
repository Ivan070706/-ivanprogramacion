/*
 * Autor:
 * Des:
 * Fecha:
 */

package matrices;

public class ArraysTemperatura {

	public static void main(String[] args) {
		final int TOTAL_MESES = 12;
		final int  TOTAL_DIAS = 30;
		
		int diaMasCalor=0, tempeMasAlta, diaTemp10; 
		
		
		int [][] temperatura; // Declaración array bidimensional
		temperatura = new int[TOTAL_MESES][TOTAL_DIAS];
		
		for (int mes=0; mes<temperatura.length; mes++) {          //Inicialización
			for(int dia=0; dia<temperatura[mes].length; dia++) {
				temperatura[mes][dia] = (int)(Math.random()*40);
				
			}
		}
		
		for (int mes=0; mes<temperatura.length; mes++) {          //Mostrando las temperaturas
			for(int dia=0; dia<temperatura[mes].length; dia++) {
				System.out.print(temperatura[mes][dia] + "\t"); 
		
			}
			System.out.println();
			
		}
		// para cada mas, calcular que dia fue el mas caluroso y que temperatura fue 
		for(int mes=0; mes<12; mes++) {
			tempeMasAlta =temperatura[mes][0];//cada mes inicializo la temp mas alta a la temperatura del primer dia 
			for(int dia=1; dia<30; dia++) {// empiezo a comparar temperaturas a partir del segundo dia 
				if(tempeMasAlta < temperatura[mes][dia]) {
					tempeMasAlta = temperatura[mes][dia];
					diaMasCalor = dia;
				}
				
			}
			System.out.println("El dia " +diaMasCalor+ " hubo " + tempeMasAlta);
			
		}
		//Para cada mes, mostrar el primer dia con temperatura inferior a 10 grados 
		for (int mes=0; mes<temperatura.length; mes++) {  
			diaTemp10 = 0;
			 do {
			     diaTemp10++;
		}while (temperatura[mes][diaTemp10]>10);
			 System.out.println("Para el mes " + mes + " el primer dia con menos de 10 grados es: " + diaTemp10);
			}
			
		}
		
	}


	


