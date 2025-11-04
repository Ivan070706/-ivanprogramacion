package tipovariables;

public class Enumeración {
	  public enum Mes {ENERO,FEBRERO,MARZO,ABRIL,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE};
	public static void main(String[] args) {
		Mes mesActual = Mes.SEPTIEMBRE;
		Mes mesSiguiente = Mes.OCTUBRE;
		
		System.out.println("Este mes es: " + mesActual);
		System.out.println("El mes siguiente es: " + mesSiguiente);
		

	}

}
