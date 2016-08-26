package mz.com.cedsif.conversor.servicos;

import static org.junit.Assert.*;
import mz.com.cedsif.conversor.Modelo.Numero;

import org.junit.Before;
import org.junit.Test;

public class ServicosTest {

	private Servicos servico;
	private Numero numero;

	@Before
	public void setUp() {
		numero = new Numero();
	}

	@Test
	public void deveRetornarDuasUnidades() {
		numero.setValor(2);
		servico = new Servicos(numero);
		assertEquals("II", servico.converterUnidades());
	}

	@Test
	public void deveRetornarUnidadesCincoMenosUm() {
		numero.setValor(4);
		servico = new Servicos(numero);
		assertEquals("IV", servico.converterUnidades());
	}

	@Test
	public void deveRetornarCinco() {
		numero.setValor(5);
		servico = new Servicos(numero);
		assertEquals("V", servico.converterCinco());
	}
	
	@Test
	public void deveRetornarNoveUnidadesEmRomano(){
		numero.setValor(9);
		servico=new Servicos(numero);
		assertEquals("IX", servico.converterUnidades());
	}

	@Test
	public void deveRetornarDuasDezenas() {
		numero.setValor(25);
		servico = new Servicos(numero);
		assertEquals("XX", servico.converteDezenas());
	}

	@Test
	public void deveRetornarCinquentaRomano() {
		numero.setValor(50);
		servico = new Servicos(numero);
		assertEquals("L", servico.converteDezenas());
		//assertEquals("X", servico.converteDezenas());
	}

	@Test
	public void deveRetornarUmaCentenaEmRomano() {
		numero.setValor(165);
		servico = new Servicos(numero);
		assertEquals("C", servico.converteCentena());
		//assertEquals("L", servico.converteCinquenta());
		assertEquals("LX", servico.converteDezenas());
		assertEquals("V", servico.converterCinco());
	}

	@Test
	public void deveReTornarTresM() {
		numero.setValor(3000);
		servico = new Servicos(numero);
		assertEquals("MMM", servico.converteMilharesParaString());
	}
	
	
	@Test
	public void deveRetornarOitucentosECinquentaESeisEmRomano(){
		numero.setValor(856);
		servico=new Servicos(numero);
		assertEquals("DCCCLVI", servico.converteNumero());
	}

}
