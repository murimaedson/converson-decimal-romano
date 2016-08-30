package mz.com.cedsif.conversor.Modelo;

import java.util.ArrayList;
import java.util.List;

public class NumeroRomano {

	private List<Integer> numeros;
	private String numeroRomano;

	public NumeroRomano(String numeroRomano) {
		// TODO Auto-generated constructor stub
		this.numeroRomano = numeroRomano;
	}

	public List<Character> getParcelasRomano() {
		ArrayList<Character> parcelas = new ArrayList<Character>();
		for (int i = 0; i < this.numeroRomano.length(); i++) {
			parcelas.add(numeroRomano.charAt(i));
		}
		return parcelas;
	}

	public List<Integer> getValores() {
		// TODO Auto-generated method stub
		List<Integer> inteiros = new ArrayList<>();
		List<Character> parcelas = getParcelasRomano();
		for (int i = 0; i < getParcelasRomano().size(); i++) {
			if (parcelas.get(i) == 'I')
				inteiros.add(1);
			if (parcelas.get(i) == 'V')
				inteiros.add(5);
			if (parcelas.get(i) == 'X')
				inteiros.add(10);
			if (parcelas.get(i) == 'L')
				inteiros.add(50);
			if (parcelas.get(i) == 'C')
				inteiros.add(100);
			if (parcelas.get(i) == 'D')
				inteiros.add(500);
			if (parcelas.get(i) == 'M')
				inteiros.add(1000);
		}
		return inteiros;
	}

	public int converte() {
		// TODO Auto-generated method stub
		List<Integer> valores = getValores();
		int valor = 0;

		for (int i = 0; i < valores.size(); i++) {

			if (i > 0 && valores.get(i) > valores.get(i - 1))
				valor = valor - valores.get(i - 1) + valores.get(i)
						- valores.get(i - 1);
			else
				valor += valores.get(i);

		}
		return valor;
		
	}
}
