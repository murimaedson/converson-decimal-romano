package mz.com.cedsif.conversor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import mz.com.cedsif.conversor.Modelo.Numero;
import mz.com.cedsif.conversor.servicos.Servicos;

@WebServlet("/conversorNumero")
public class conversorNumero extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String valorString=(request.getParameter("numero"));
		int valor=Integer.parseInt(valorString);
		
		
		Numero numero = new Numero();
		numero.setValor(valor);
		
        Servicos servicos = new Servicos(numero);
      
        String numConvertido=  servicos.converteNumero();
		
		
	
		request.setAttribute("numero",numConvertido);
		
		//response.sendRedirect("/conversion.jsp");
		
	RequestDispatcher rd = request.getRequestDispatcher("numeroConvertido.jsp");
               rd.forward(request, response);
	}
	
}
