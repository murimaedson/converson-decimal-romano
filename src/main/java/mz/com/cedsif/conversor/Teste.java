package mz.com.cedsif.conversor;

import mz.com.cedsif.conversor.Modelo.NumeroDecimal;
import mz.com.cedsif.conversor.servicos.Servicos;

public class Teste {

	public static void main(String[] args) {
<<<<<<< HEAD
		NumeroDecimal numero = new NumeroDecimal();
		numero.setValor(3483);
=======
		Numero numero = new Numero();
		numero.setValor(5000);
>>>>>>> 4e70b305348853c03c1c02e1fdab37eb09528259
		// System.out.println(numero.getDezenas());
		Servicos servicos = new Servicos(numero);

		System.out.println(servicos.converteNumero());
	}
}
