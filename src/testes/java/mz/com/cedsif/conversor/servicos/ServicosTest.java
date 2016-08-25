package mz.com.cedsif.conversor.servicos;

import static org.junit.Assert.assertEquals;
import mz.com.cedsif.conversor.Modelo.TipoNumero;

import org.junit.Before;
import org.junit.Test;

public class ServicosTest {
	private Servicos servico;

	@Before
	public void setUp() {
		servico=new Servicos();
	}

	@Test
	public void calculaONumeroDeCaracteres() {
		int numero = servico.calculaNumeroracteres(12);
		assertEquals(2, numero);
	}

	@Test
	public void deveSerDezena() {
		TipoNumero tipoNumero=servico.getTipoNumeracao(20);
		assertEquals(TipoNumero.DEZENA, tipoNumero);
	}

	
	@Test
	public void deveSerCentena() {
		TipoNumero tipoNumero=servico.getTipoNumeracao(520);
		assertEquals(TipoNumero.CENTENA, tipoNumero);
	}
}
