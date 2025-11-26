package ejercicio6;

public class Ejercicio6 {

	public static void main(String[] args) {
        // Ejemplos de llamada al método con diferentes parámetros

        // Caso 1: Proyectos no terminados
        System.out.println(auditoriaEmpresa(15000, 12000, 2000, 10, false, 95000)); // false

        // Caso 2: Gasto en sueldos excede el límite
        System.out.println(auditoriaEmpresa(15000, 12000, 2000, 10, true, 95000)); // false

        // Caso 3: Presupuesto excede el límite
        System.out.println(auditoriaEmpresa(8000, 7000, 1500, 5, true, 110000)); // false

        // Caso 4: Todo correcto
        System.out.println(auditoriaEmpresa(5000, 7000, 1500, 5, true, 95000)); // true
    }

	
	  public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinistas, int numeroOficinistas, boolean proyectosTerminados, double presupuestoEmpresa) {
	        
	        // 1. Comprobamos si los proyectos han sido terminados
	        if (!proyectosTerminados) {
	            System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados.");
	            return false;
	        }
	        
	        // 2. Calculamos el gasto total en sueldos
	        double gastoSueldos = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);
	        
	        // Comprobamos si el gasto en sueldos excede el límite de 20.000 euros
	        if (gastoSueldos > 20000) {
	            System.out.println("No ha pasado la auditoría ya que el gasto en personal es de " + gastoSueldos + " y excede el límite mensual de 20.000 euros.");
	            return false;
	        }
	        
	        // 3. Comprobamos si el presupuesto de la empresa excede el límite de 100.000 euros
	        if (presupuestoEmpresa > 100000) {
	            System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de " + presupuestoEmpresa + " excede el límite establecido de 100.000 euros.");
	            return false;
	        }
	        
	        // Si todo está correcto, se pasa la auditoría
	        System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene.");
	        return true;
	    }

}
