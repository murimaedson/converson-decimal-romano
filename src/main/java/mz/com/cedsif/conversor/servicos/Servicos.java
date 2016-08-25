package mz.com.cedsif.conversor.servicos;

import mz.com.cedsif.conversor.Modelo.Numero;

public class Servicos {

	public String converteMilharesParaString(Numero numero) {
		int milhares = numero.getMilhares();
		String retornoMilhares = "";
		if (milhares != 0) {
			for (int i = 0; i < milhares; i++) {
				retornoMilhares = retornoMilhares + "M";
			}
		}
		return retornoMilhares;
	}

	public String getUnidades(Numero numero) {
		// TODO Auto-generated method stub
		int unidades = numero.getUnidades();
		String retornoUnidades = "";
		if (unidades > 0 && unidades < 4) {
			for (int i = 0; i < unidades; i++) {
				retornoUnidades = retornoUnidades + "I";
			}
		}
		if (unidades == 4)
			retornoUnidades = "IV";
		return retornoUnidades;
	}
}
