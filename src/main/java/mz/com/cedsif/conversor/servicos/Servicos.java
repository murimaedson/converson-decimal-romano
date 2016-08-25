package mz.com.cedsif.conversor.servicos;

import mz.com.cedsif.conversor.Modelo.TipoNumero;

public class Servicos {

	public int calculaNumeroracteres(int numero) {
		// TODO Auto-generated method stub
		String numeroEmString = numero + "";
		return numeroEmString.length();
	}

	public TipoNumero getTipoNumeracao(int numero) {
		// TODO Auto-generated method stub
		if (calculaNumeroracteres(numero) == 1)
			return TipoNumero.UNIDADE;
		if (calculaNumeroracteres(numero) == 2)
			return TipoNumero.DEZENA;
		if (calculaNumeroracteres(numero) == 3)
			return TipoNumero.CENTENA;
		if (calculaNumeroracteres(numero) == 4)
			return TipoNumero.MILHARES;
		return null;
	}

}
