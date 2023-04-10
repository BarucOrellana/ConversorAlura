package Principal;

import javax.swing.*;

import ConversorMonedas.OpcionesConversionArgentina;
import ConversorMonedas.OpcionesConversionMexico;
import ConversorTemperatura.OpcionesConversionTemperatura;


public class Principal {

	public static void main(String[] args) {
		
		OpcionesConversionArgentina conversionA = new OpcionesConversionArgentina();
		OpcionesConversionMexico conversionM = new OpcionesConversionMexico();
		OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			
			
			switch(opciones) {
			case "Conversor de Monedas":
				
				String pais = JOptionPane.showInputDialog(null, "Seleccione un país", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
						new Object[] {"México", "Argentina"}, "Elegir").toString();
				
				switch (pais) {
				case "Argentina":
					String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
					double valorRecibido = Double.parseDouble(input);
					conversionA.ConvertirMonedas(valorRecibido);
					
				case "Mexico":
					String inputm = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
					double valorRecibidom = Double.parseDouble(inputm);
					conversionM.ConvertirMonedas(valorRecibidom);
				}
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				break;
				
			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConvertirTemperaturas(valorRecibidoT);
				
				
				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuestaT) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				
				
				
		}
		break;
	}
	
}
	
}
