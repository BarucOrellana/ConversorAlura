package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversionMexico {
	
	ConvertirMonedasMexico monedas = new ConvertirMonedasMexico();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sub-coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sub-coreano a Pesos"}, 
					"Seleccion")).toString();
	
		switch (opcion) {
		case "De Pesos a Dólar": 
			monedas.ConvertirPesosMexicanosDolares(valor);
			break;
		
		case "De Pesos a Euro": 
			monedas.ConvertirPesosMexicanosEuros(valor);
			break;
			
		case "De Pesos a Libras Esterlinas":
			monedas.ConvertirPesosMexicanosLibra(valor);
			break;
			
		case "De Pesos a Yen Japonés":
			monedas.ConvertirPesosMexicanosYen(valor);
			break;
			
		case "De Pesos a Won sub-coreano":
			monedas.ConvertirPesosMexicanosWon(valor);
			break;
		
		case "De Dólar a Pesos":
			monedas.ConvertirDolaresPesosMexicanos(valor);
			break;
			
		case "De Euro a Pesos":
			monedas.ConvertirEurosPesosMexicanos(valor);
			break;
			
		case "De Libras Esterlinas a Pesos":
			monedas.ConvertirLibraPesosMexicanos(valor);
			break;
		 
		case "De Yen Japonés a Pesos":
			monedas.ConvertirYenPesosMexicanos(valor);
			break;
			
		case "De Won sub-coreano a Pesos":
			monedas.ConvertirWonPesosMexicanos(valor);
			break;
		}

	}
}
