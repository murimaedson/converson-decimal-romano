package mz.com.cedsif.conversor;

import mz.com.cedsif.conversor.Modelo.Numero;
import mz.com.cedsif.conversor.servicos.Servicos;

public class Teste {

	public static void main(String[] args) {
		Numero numero = new Numero();
		numero.setValor(5000);
		// System.out.println(numero.getDezenas());
		Servicos servicos = new Servicos(numero);

		System.out.println(servicos.converteNumero());
	}
}
