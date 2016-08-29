package mz.com.cedsif.conversor;

import mz.com.cedsif.conversor.Modelo.NumeroRomano;

public class TesteRomanosParaDecimal {

	public static void main(String[] args) {
		NumeroRomano numeroRomano = new NumeroRomano("XII");
		String[] parcelas = numeroRomano.getParcelas();
		for (String string : parcelas) {
			System.out.println(string);
		}
	}
}
