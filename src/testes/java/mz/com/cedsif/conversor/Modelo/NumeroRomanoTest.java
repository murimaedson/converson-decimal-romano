package mz.com.cedsif.conversor.Modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroRomanoTest {

	@Test
	public void deveRetornarUmDecima() {
		NumeroRomano numeroRomano = new NumeroRomano("I");
		assertEquals(1, numeroRomano.converte());
	}

	@Test
	public void deveRetornarTresDecimal() {
		NumeroRomano numeroRomano = new NumeroRomano("III");
		assertEquals(3, numeroRomano.converte());
	}

	@Test
	public void deveRetornarQuatroDecimal() {
		NumeroRomano numeroRomano = new NumeroRomano("IV");
		assertEquals(4, numeroRomano.converte());
	}

	@Test
	public void deveRetornarCincoDecimal() {
		NumeroRomano numeroRomano = new NumeroRomano("V");
		assertEquals(5, numeroRomano.converte());
	}
	
	
	@Test
	public void deveRetornarNove(){
		NumeroRomano numeroRomano = new NumeroRomano("IX");
		assertEquals(9, numeroRomano.converte());
	}
	
	@Test
	public void deveRetornarNovicentosESecentaEOito(){
		NumeroRomano numeroRomano = new NumeroRomano("CMLXVIII");
		assertEquals(968, numeroRomano.converte());
	}
	
	
	@Test
	public void deveRetornarMilQuinhentosEVinteETres(){
		NumeroRomano numeroRomano = new NumeroRomano("MDXXIII");
		assertEquals(1523, numeroRomano.converte());
	}
}
