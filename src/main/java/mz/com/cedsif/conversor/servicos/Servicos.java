package mz.com.cedsif.conversor.servicos;

import mz.com.cedsif.conversor.Modelo.Numero;

public class Servicos {
	private Numero numero;

	public Servicos(Numero numero) {
		// TODO Auto-generated constructor stub
		this.numero = numero;
	}

	public String converteMilharesParaString() {
		int milhares = numero.getMilhares();
		String retornoMilhares = "";
		if (milhares != 0) {
			for (int i = 0; i < milhares; i++) {
				retornoMilhares = retornoMilhares + "M";
			}
		}
		return retornoMilhares;
	}

	public String converterUnidades() {
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
		if (unidades == 5)
			retornoUnidades = "V";
		if (unidades > 5 && unidades < 9) {
			int diferenca = unidades - 5;
			retornoUnidades = "V";
			for (int i = 0; i < diferenca; i++) {
				retornoUnidades = retornoUnidades + "I";
			}
		}
		if (unidades == 9)
			retornoUnidades = "IX";

		return retornoUnidades;
	}

	public String converterCinco() {
		// TODO Auto-generated method stub
		if (numero.getCincos() == 1)
			return "V";
		else
			return "";
	}

	public String converteDezenas() {
		// TODO Auto-generated method stub
		int dezenas = numero.getDezenas();
		String retorno = "";

		if (dezenas > 0 && dezenas < 4)
			for (int i = 0; i < dezenas; i++)
				retorno += "X";

		if (dezenas == 4)
			retorno = "XL";
		if (dezenas == 5)
			retorno = "L";
		if (dezenas > 5 && dezenas < 9)
			retorno = "L";
		if (dezenas - 5 > 0) {
			for (int i = 0; i < dezenas - 5; i++)
				retorno += "X";

		}
		if (dezenas == 9)
			retorno = "XC";
		return retorno;
	}

	public String converteCinquenta() {
		// TODO Auto-generated method stub
		if (numero.getCinquentas() == 1)
			return "L";
		else
			return "";
	}

	public String converteCentena() {
		// TODO Auto-generated method stub
		String retorno = "";
		if (numero.getCentenas() > 0 && numero.getCentenas() < 4) {
			for (int i = 0; i < numero.getCentenas(); i++)
				retorno += "C";
		}
		if (numero.getCentenas() == 4)
			retorno = "CD";
		if(numero.getCentenas()==5)
			retorno="D";
		if(numero.getCentenas()>5 && numero.getCentenas()<9){
			retorno="D";
			for(int i=0;i<numero.getCentenas()-5;i++)
				retorno+="C";
		}
		if(numero.getCentenas()==9)
			retorno="CM";
		return retorno;
	}

	public String converteNumero() {
		return converteMilharesParaString()+converteCentena() + converteDezenas() + converterUnidades();
	}
	

}
