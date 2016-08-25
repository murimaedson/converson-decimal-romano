package mz.com.cedsif.conversor.servicos;

import static org.junit.Assert.*;
import mz.com.cedsif.conversor.Modelo.Numero;

import org.junit.Before;
import org.junit.Test;

public class ServicosTest {

	private Servicos servico;
	private Numero numero;
	
	@Before
	public void setUp(){
		servico=new Servicos();
		numero=new Numero();
	}
	
	@Test
	public void deveRetornarDuasUnidades(){
		numero.setValor(2);
		
		assertEquals("II", servico.getUnidades(numero));
	}
	
	
	@Test
	public void deveRetornarUnidadesCincoMenosUm(){
		numero.setValor(4);
		assertEquals("IV", servico.getUnidades(numero));
	}
	
	@Test
	public void deveReTornarTresM() {
		numero.setValor(3000);
		assertEquals("MMM", servico.converteMilharesParaString(numero));
	}
	


}
