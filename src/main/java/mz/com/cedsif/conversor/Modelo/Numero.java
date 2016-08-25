package mz.com.cedsif.conversor.Modelo;

public class Numero {

	private int valor;
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int getUnidades() {
		int restoMilhares = valor % 1000;
		int restoQuinhentos = restoMilhares % 500;
		int restoCentenas = restoQuinhentos % 100;
		int restoCinquentas = restoCentenas % 50;
		int restoDezenas = restoCinquentas % 10;
		int restoCincos = restoDezenas % 5;
		return restoCincos;
	}

	public int getCincos() {
		int restoMilhares = valor % 1000;
		int restoQuinhentos = restoMilhares % 500;
		int restoCentenas = restoQuinhentos % 100;
		int restoCinquentas = restoCentenas % 50;
		int restoDezenas = restoCinquentas % 10;
		return restoDezenas / 5;
	}

	public int getDezenas() {
		int restoMilhares = valor % 1000;
		int restoQuinhentos = restoMilhares % 500;
		int restoCentenas = restoQuinhentos % 100;
		int restoCinquentas = restoCentenas % 50;
		return restoCinquentas / 10;
	}

	public int getCinquentas() {
		int restoMilhares = valor % 1000;
		int restoQuinhentos = restoMilhares % 500;
		int restoCentenas = restoQuinhentos % 100;
		return restoCentenas / 50;
	}

	public int getCentenas() {
		int restoMilhares = valor % 1000;
		int restoQuinhentos = restoMilhares % 500;
		return restoQuinhentos / 100;
	}

	public int getQuinhentas() {
		int restoMilhares = valor % 1000;
		return restoMilhares / 500;
	}

	public int getMilhares() {
		return valor / 1000;
	}

}
