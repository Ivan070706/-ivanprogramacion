package tipovariables;

public class ConversionTipos {

	public static void main(String[] args) {
		byte monederoPequenyo = 10;
		int monederoMediano = 10000;
		long monederoGrande = 10000000000000l;
		
		//monederoGrande = monederoMediano; // conversión automatica
		//monederoMediano = monederoPequenyo;
		
		monederoPequenyo = (byte) monederoMediano;//casting (conversión explicita)
        
		System.out.println("Monedero pequeño: " + monederoPequenyo);
		System.out.println("Monedero mediano: " + monederoMediano);
		System.out.println("Monedero grande: " + monederoGrande);
		
		

	}

}
