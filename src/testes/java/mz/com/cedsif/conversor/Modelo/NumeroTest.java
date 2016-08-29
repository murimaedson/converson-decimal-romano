package mz.com.cedsif.conversor.Modelo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumeroTest {

	private NumeroDecimal numero;

	@Before
	public void setUp() {
		numero = new NumeroDecimal();
	}

	@Test
	public void deveRetornarTresUnidades() {
		numero.setValor(3);
		assertEquals(3, numero.getUnidades());
	}

	@Test
	public void deveRetornarUmCincoETresUnidades() {
		numero.setValor(8);
		assertEquals(3, numero.getUnidades());
		assertEquals(1, numero.getCincos());
	}

	@Test
	public void deveRetornarDuasDezenasUmCincoUmaUnidade() {
		numero.setValor(26);
		assertEquals(2, numero.getDezenas());
		assertEquals(1, numero.getCincos());
		assertEquals(1, numero.getUnidades());
	}

	@Test
	public void deveRetornarUmCinquentaTresDezenasUmCincoZeroUnidades() {
		numero.setValor(85);

		assertEquals(1, numero.getCinquentas());
		assertEquals(3, numero.getDezenas());
		assertEquals(1, numero.getCincos());
		assertEquals(0, numero.getUnidades());
	}

	@Test
	public void deveRetornarDuasCentenasUmCinquenta() {
		numero.setValor(253);
		assertEquals(2, numero.getCentenas());
		assertEquals(1, numero.getCinquentas());
	}

	@Test
	public void deveRetornarUmQuinhentoUmaCentena() {
		numero.setValor(663);

		assertEquals(1, numero.getQuinhentas());
		assertEquals(1, numero.getCentenas());
		assertEquals(3, numero.getUnidades());
	}
	
	
	@Test
	public void deveRetornarTresMilharesUmQuinhentosTesCentenas(){
		numero.setValor(3860);
		
		assertEquals(3, numero.getMilhares());
		assertEquals(1, numero.getQuinhentas());
		assertEquals(3, numero.getCentenas());
	}

}
