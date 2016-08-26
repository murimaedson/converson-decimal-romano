package mz.com.cedsif.conversor;

import javax.swing.JOptionPane;

import mz.com.cedsif.conversor.Modelo.Numero;
import mz.com.cedsif.conversor.servicos.Servicos;

public class Teste2 {

	public static void main(String[] args) {
		String numeroStr=JOptionPane.showInputDialog("Introduza o Numero");
		int numeroIntroduzido=Integer.parseInt(numeroStr);
		
		Numero numero = new Numero();
		numero.setValor(numeroIntroduzido);
		
		Servicos servicos = new Servicos(numero);
		
		JOptionPane.showMessageDialog(null, servicos.converteNumero());
	}
}
