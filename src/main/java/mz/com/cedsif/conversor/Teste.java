package mz.com.cedsif.conversor;

import mz.com.cedsif.conversor.Modelo.NumeroDecimal;
import mz.com.cedsif.conversor.servicos.Servicos;

public class Teste {

	public static void main(String[] args) {
		NumeroDecimal numero = new NumeroDecimal();
		numero.setValor(3483);
		// System.out.println(numero.getDezenas());
		Servicos servicos = new Servicos(numero);

		System.out.println(servicos.converteNumero());
	}
}
